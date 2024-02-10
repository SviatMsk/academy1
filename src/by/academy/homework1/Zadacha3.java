package by.academy.homework1;

import java.util.Scanner;

public class Zadacha3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int x = sc.nextInt();
       switch (x) {
           case (1):
               for (x = 1 ; x < 11; x++)
                   System.out.println(("1*" + x) + "=" + x);
               break;

               case (2):
              for (x = 1 ; x < 11; x++)
                   System.out.println(2 + "*" + (x)+"=" + (x*2));
               break;
           case (3):
               for (x = 1 ; x < 11 ; x++)
                   System.out.println(3 + "*" + (x)+"=" + (x*3));
               break;
           case (4):
               for (x = 1 ; x < 11; x++)
                   System.out.println(4 + "*" + (x)+"=" + (x*4));
               break;
           case (5):
               for (x = 1 ; x < 11; x++)
                   System.out.println(5 + "*" + (x)+"=" + (x*5));
               break;
           case (6):
               for (x = 1 ; x < 11; x++)
                   System.out.println(6 + "*" + (x)+"=" + (x*6));
               break;
           case (7):
           for (x = 1 ; x < 11; x++)
               System.out.println(7 + "*" + (x)+"=" + (x*7));
           break;
           case (8):
               for (x = 1 ; x < 11; x++)
                   System.out.println(8 + "*" + (x)+"=" + (x*8));
               break;
           case (9):
               for (x = 1 ; x < 11; x++)
                   System.out.println(9 + "*" + (x)+"=" + (x*9));
               break;
           case(10):
           for (x = 1 ; x < 11; x++)
               System.out.println(10 + "*" + (x)+"=" + (x*10));
           break;
       }
    sc.close();
    }
}
