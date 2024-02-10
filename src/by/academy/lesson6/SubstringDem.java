package by.academy.lesson6;

public class SubstringDem {
    public static void main(String[] artgs){
        String text = "Java Java Java. I'm coding on Java. Java best coding language ";
        String string1 = text.substring(0, 14);
        System.out.println(string1);
        String string2 = text.substring(16, 36);
        System.out.println(string2);
    }
}
