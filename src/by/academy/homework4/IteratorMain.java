package by.academy.homework4;

import java.util.Iterator;

public class IteratorMain {
    public static void main(String[] args) {

        Integer[] array = {2,4,6,8,10};

        Iterator1<Integer> Iterator = new Iterator1<>(array);

        while (Iterator.hasNext()) {
            System.out.print(Iterator.next() + " ");
        }
    }
}

