package by.academy.homework4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//Создать класс CustomDate, используя внутренние классы Год, Месяц, День.
//        Методы: задать дату, вывести на консоль день недели по заданной дате.
//        День недели представить в виде перечисления.
//        Рассчитать количество дней, в заданном временном промежутке.
//        Один из конструкторов - строка в формате dd-mm-yyyy, добавить статический метод-валидацию для этой строки.
//        После валидации в конструкторе создаем объекты класса Year, Month, Day.
//        Добавить метод, который проверяет високосный ли год или нет.
public class CustomDate{
    LocalDate date1 = LocalDate.now();

    class Year{}
    class Month{}
    class Day{}
}
