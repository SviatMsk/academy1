package by.academy.homework2;
//Условие здачи: ввести 2 слова, состоящие из четного
//        числа букв. Получить слово состоящее из первой
//        половины первого слова и второй половины второго слова.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String str3 = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое слово: ");
        String str1 = sc.nextLine();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.length() % 2 == 0) {
                System.out.print("Введите второе слово: ");
                String str2 = sc.nextLine();
                for (int j = 0; j < str2.length(); i++) {
                    if (str2.length() % 2 == 0)
                        System.out.println(str3 = (str1.substring(0, str1.length() / 2)) +
                                (str2.substring(str2.length() / 2)));
                    break;
                }
            } else System.out.println("Вводите слова из четного колличества букв");
            break;

        }
    }
}