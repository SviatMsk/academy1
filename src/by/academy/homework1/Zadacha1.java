package by.academy.homework1;

import java.util.Scanner;

public class Zadacha1 {
    public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите сумму");
                double sum = sc.nextDouble();
                System.out.println("Введите возраст");
                int age = sc.nextInt();
                if (sum < 100) {
                    System.out.println(sum - (sum / 100 * 5));
                }
                else if(sum > 100 && sum < 199)
                {
                    System.out.println(sum - (sum / 100 * 7));
                }
                    else if (sum > 200 && sum < 299 && age > 18) {
                    System.out.println(sum - (sum / 100 * (12 + 4)));
                }
                else if (sum > 200 && sum < 299 && age < 18) {
                    System.out.println(sum - (sum / 100 * (12 - 3)));
                }
                    else if(sum > 200 && sum < 299){
                        System.out.println(sum - (sum / 100 * 12));
                    }
                else if(sum > 300 && sum < 399) {
                    System.out.println(sum - (sum / 100 * 15));
                }
                else if(sum >= 400) {
                    System.out.println(sum - (sum / 100 * 20));
                }
                sc.close();
            }
        }