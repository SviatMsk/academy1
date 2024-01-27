package by.academy.homework5;
//Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
//        Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз.
//        Замерьте время, которое потрачено на это.
//        Сравните результаты и предположите, почему они именно такие.

import java.util.ArrayList;
import java.util.LinkedList;


public class Task2 {
    private static final int N = 1000000;
    private static final int M = 100000;

    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            arrayList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println("Time spent : " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            linkedList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
