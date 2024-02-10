package by.academy.lesson6;

public class INdexOF {
    public static void main(String[] args){
        //Java Java JAva. I'm
        String text = "Java Java Java. I'm coding on Java. Java best coding language ";
       int size = "Java".length();
        int indexStart = 0;
        int indexEnd = 0;
        do { indexStart = text.indexOf("Java", indexEnd);
            indexEnd = indexStart + size;
            if (indexStart >= 0){
                System.out.println(" Start: " + indexStart + " End: " + indexEnd);
            }
        } while(indexStart >= 0);
        int lastIndexStart = text.lastIndexOf("Java");
        System.out.println("Last index of : " + lastIndexStart);
        }
    }