package by.academy.homework5;

import by.academy.homework4.Iterator1;

import java.util.Arrays;

public class Task3Main {
    public static void main(String[] args) {

        Integer[][] array = new Integer[][]{{12, 4, 88, 9, 5}, {5, 12, 33, 9, 1}};
        Iterator1<Integer[]> IteratorMain = new Iterator1<>(array);

        while (IteratorMain.hasNext()) {
            System.out.println(Arrays.toString(IteratorMain.next()));
        }
    }
}
