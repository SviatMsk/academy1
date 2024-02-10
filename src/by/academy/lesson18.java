package by.academy;

import java.io.File;
import java.io.IOException;

public class lesson18 {
    public static void main(String[] args) {


        File newFile = new File("C://SomeDir//MyFile");
        try {
            boolean created = newFile.createNewFile();
            if (created)
                System.out.println("File has been created");
        } catch (IOException ex) {

        }
    }
}
