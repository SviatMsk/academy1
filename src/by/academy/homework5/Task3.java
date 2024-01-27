package by.academy.homework5;
//Написать итератор по двумерному массиву. (Отдельный класс. Наследуемся от Iterator<T>)
//        Протестировать в main.

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Task3<T> implements Iterator<T> {
    private T[][] array;

    public Task3(T[][] array) {
        this.array = array;
    }

    private int i, j;

    @Override
    public boolean hasNext() {
        for (int i = this.i; i < array.length; i++) {
            for (int j = this.j; j < array[i].length; j++) {
                return true;
            }
        }
        return false;
    }


    @Override
    public T next() {
        if (!hasNext())
            throw new NoSuchElementException();
        T t = array[i][j];
        j++;
        for (int i = this.i; i < array.length; i++) {
            for (int j = (i == this.i ? this.j : 0); j < array[i].length; j++) {
                this.i = i;
                this.j = j;
                return t;
            }
        }

        return t;
    }
};

