package by.academy.lesson6;

public class IndexOFLast {
    public static void main(String[] args) {
        //Java Java JAva. I'm
//        String text = "Java Java Java. I'm coding on Java. Java best coding language ";
//        int size = "Java".length();
//        int indexStart = text.lastIndexOf("Java");
//        int indexEnd = 0;
//        do {
//            indexStart = text.lastIndexOf("Java", indexEnd - 1);
//            indexEnd = indexStart + size;
//
//
//        if (indexStart >= 0) {
//            System.out.println(" Start: " + indexStart + " End: " + indexEnd);
//            while (indexStart >= 0) {
//                int lastIndexStart = text.lastIndexOf("Java");
//                System.out.println("Last index of : " + lastIndexStart);
//            }
//        }
//
        String text = "Java Java Java. I'm coding on Java. Java best coding language ";
        int size = "Java".length();
        int indexStart = text.lastIndexOf("Java");
        int indexEnd = 0;
        do { indexStart = text.lastIndexOf("Java", indexEnd - 1);
            indexEnd = indexStart + size;
            if (indexStart >= 0){
                System.out.println(" Start: " + indexStart + " End: " + indexEnd);
            }
        } while(indexStart >= 0);
        int lastIndexStart = text.lastIndexOf("Java");
        System.out.println("Last index of : " + lastIndexStart);
    }
}
