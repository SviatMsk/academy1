package by.academy.homework5;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

//        Напишите метод, который на вход получает
//        коллекцию объектов, а возвращает коллекцию уже без дубликатов.
public class Task1 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 3, 4, 4, 7);
        System.out.println("List" + list);
        System.out.println("removeDuplicatesList " + removeDuplicates(list));

    }

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }

}

