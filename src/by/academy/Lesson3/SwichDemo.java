package by.academy.Lesson3;

import java.util.Scanner;

public class SwichDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("vvodi month");
        String month = sc.next();
        switch (month) {
            case "apr":
                System.out.println(4);
                break;
            default:
                System.out.println("net takogo");
        }
        sc.close();
    }
}
