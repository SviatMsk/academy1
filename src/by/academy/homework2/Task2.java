package by.academy.homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите колличество слов ");
        int n = sc.nextInt();
        String[] str = new String[n];
        Scanner sc2  = new Scanner(System.in);
       for(int i = 0; i < str.length; i++){
           System.out.println(" Введите " + (i +1) + "слово");
           str[i] = sc2.nextLine();
       }
        String wordMin = null;
        int maxSymbols = 10000;
        for(int i = 0; i < n; i++) {
            if(maxSymbols>str[i].length()){
                maxSymbols=str[i].length();
                wordMin=str[i];
            }
        }
        System.out.println(" Самое короткое слово " + wordMin);
    }

}