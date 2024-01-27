package by.academy.homework5;
//Можно писать все в main. Не нужно создавать новых классов.
//        Имеется текст. Следует составить для него частотный словарь:
//        Создать Map<Character, Integer> для символов, в который мы заносим символ и его количество.

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {

        String str = "Кит на фене ныне не фантик," +
                "кит на море ныне романтик.";
        String str1 = str.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            Character character = str1.charAt(i);
            Integer counter = map.get(character);
            if (counter == null) {
                counter = 1;
                map.put(character, counter);
            } else {
                counter += 1;
                map.put(character, counter);
            }
        }
        System.out.println("Частотный словарь " + map.toString());
    }
}


