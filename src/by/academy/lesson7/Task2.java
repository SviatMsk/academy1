package by.academy.lesson7;
//.дан массив чисел
public class Task2 {
    public static void main(String[] args){
        int[] array = {1, 4, 8, 2, 3, 1, 8, 4, 2};
        int result = 0;
        for (int i =0; i<array.length; i++){
            result ^=array[i];
        }
        System.out.println(result);

    }
}
