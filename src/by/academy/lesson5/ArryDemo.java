package by.academy.lesson5;

import java.util.Random;
import java.util.Scanner;

public class ArryDemo {
    public static void main(String[] args){
        int [] prim = new int[10];//создаём массив рамером 10
        Random rand = new Random();//создаем обьект который добовляет рандомное занчение в массив
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число");
        int n = sc.nextInt();
        for(int i = 0; i < prim.length; i++) {
            prim[i] = rand.nextInt(10);//добовляет рандомное значение элементу I
            if(prim[i]>n){//если элмент больше введенного значения вывод на экран
                System.out.println(prim[i]);
            }
        }
sc.close();
    }

}
//    int[] array = new int[10];
//    Random rand = new Random();
//for (int i = 0; i < array.length; i++) {
//        array[i] = rand.nextInt(10);
//        }
//        System.out.println("initial array:");
//        for (int i = 0; i < array.length; i++) {
//        System.out.print(array[i] + "   ");
//        }
//        System.out.println();
//        for (int i = 0; i < array.length; i++) {
//        array[i] += 10;
//        }
//        System.out.println("new array:");
//        for (int i = 0; i < array.length; i++) {............
//        System.out.print(array[i] + "   ");...........
//        }................
// for (int element : array){
//System.out.print(element + "");
//}}}
