package by.academy;

public class Recursion {
    static long factorial(int n){
        if(n < 2){
            return 1;
        }
    return factorial(n-1) * n;
    }
    public static void main(String[] args){
        System.out.println("Фактроиал 3: " + factorial(3));
    }


}

