package by.academy.homework5;

import java.util.ArrayList;
import java.util.ListIterator;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//        оценками. Найти самую высокую оценку с использованием итератора.
public class Task4 {
    public static void main(String[] args) {

        int listSize = 5;

        ArrayList<Integer> marksList = new ArrayList<>();

        for (int i = 0; i < listSize; i++) {
            int y = (int) (Math.random() * 10 + 1);
            marksList.add(i, y);
        }

        System.out.print("Оценки " + marksList + " " + "\n");
        ListIterator<Integer> listIterator = marksList.listIterator();
        while (listIterator.hasNext()) {
            int max = 0;
            for (Integer s : marksList) {
                s = listIterator.next();
                if (s > max) {
                    max = s;
                }
            }
            System.out.println("Максимальная оценка " + max);
        }
    }
}
