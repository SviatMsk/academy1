package by.academy.Lesson4;

public class Zad3 {
    public static void main(String[] args){
        for(double i=0;i<=100; i++){
            if(i % 13 != 0){
                System.out.println("Пропуск" + i);
                continue;
            }
            System.out.println(i);
        }
    }

}
