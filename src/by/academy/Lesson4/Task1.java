package by.academy.Lesson4;

public class Task1 {
    public static void main(String[] args){
        int i = 50;
        while (i >= 15){
            if (i%13==0){
                break;
            }
            i--;
        }
        System.out.println(i);
    }
}
