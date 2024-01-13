package by.academy.homework4;
//Создать класс, который параметризуется любым типом (T). Имеет массив объектов нашего типа T.
//        Содержит пустой конструктор, который по дефолту инициализирует пустой массив размерности 16.
//        Содержит конструктор, принимающий значение int и инитает им размер нашего массива.
//
//        Содержит методы:
//        1) добавления в наш массив объекта типа T - add(T obj) (нужно помнить,
//        что если массив заполнен, нам нужно его расширить с помощью Arrays.copyOf)
//        2) взятие по индексу get(int i)
//        3) взятие последнего элемента getLast()
//        4) взятие первого элемента getFirst()
//        5) вывод размера массива
//        6) вывод индекса последнего заполненого элемента (не путать с размерностью)
//        7) удаление элемента по индексу (remove(int i)
//        8) удаление элемента по значению (remove(T obj))

import java.util.Arrays;

public class Array<T> {
    private T[] array;
    private int current = 0;

    public Array() {
        super();
        this.array = (T[]) new Object[16];
    }

    public Array(T[] array) {
        this.array = array;
    }

    public void add(T item) {
        if (array == null) {
            this.array = (T[]) new Object[16];
        }

        if (array.length <= current) {
            grow();
        }

        array[current++] = item;
    }

    private void grow() {
        T[] temp = (T[]) new Object[array.length * 2 + 1];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;
    }

    public void print() {
        for (int i = 0; i < current; i++) {
            System.out.println(array[i]);
        }

    }

    public void ArrayLength() {
        System.out.println("Размер массива - " + (array.length - 1));
    }

    public void getItem(int i) {
        if (i >= this.current || i < 0) {
            System.out.println("ВВедите правильный индекс");
        } else {
            System.out.println("элемент по заданному индексу = " + array[i]);
        }
    }

    public void getLastIndex() {
        System.out.println("Послдений элемент - " + array[current - 1]);
    }
    public void getFirstIndex() {
        System.out.println("ПЕрвый элемент " + array[0]);
    }
    public void indexOfLast() {
        System.out.println("Последний заполненный элемент - " + (current - 1));
    }
    public void removeIndex(int i){
        if (i >= this.current || i < 0) {
            System.out.println("Удаление невозможно");
            return;
        }
        if (i != array.length - 1) {
            System.arraycopy(array, i + 1, array, i, array.length - i - 1);
        }
        array[--current] = null;
    }


    public void removeObject(T Object) {
        for (int i = 0; i < this.current; i++) {
            if (array[i] == Object) {
                System.arraycopy(array, i + 1, array, i, array.length - i - 1);
                array[--current] = null;
                return;
            }
        }
        System.out.println("Такого числа нет в массиве");
    }

    @Override
    public String toString() {
        return "Array{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

}