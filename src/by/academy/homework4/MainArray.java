package by.academy.homework4;

import java.util.Scanner;

public class MainArray {
    public static void main(String[] args) {
        Array<Integer> array = new Array<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);
        array.add(11);
        array.add(12);
        array.add(13);
        array.add(14);
        array.add(15);
        array.add(16);
        // array.print();
        System.out.println(array);
        array.ArrayLength();
        array.getLastIndex();
        array.getFirstIndex();
        array.indexOfLast();
        System.out.println("для вывода элемента введите индекс");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        array.getItem(i);
        System.out.println(" удаление элемента по индексу, введите Индекс элемента");
        int x = sc.nextInt();
        array.removeIndex(x);
        System.out.println(array);
        System.out.println(" удаление элемента по значению, введите значение элемента");
        int y = sc.nextInt();
        array.removeObject(y);
        System.out.println(array);
    }
}
