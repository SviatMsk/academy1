package by.academy.lesson19;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TaskFile {
    public static void main(String[] args)  {
        File dir = new File("src/файл/");
        if (!dir.exists()) {
            dir.mkdirs();
        }

        File file1 = new File(dir, "1.txt");
        File file2 = new File(dir, "b.txt");

        try{
        if (!file1.exists()) {
            dir.createNewFile();
        }
        if (!file2.exists()) {
            dir.createNewFile();
        }
        }catch (IOException e ){

        }
        try (
            FileOutputStream fio1 = new FileOutputStream(file1);

            FileOutputStream fio2 = new FileOutputStream(file2)){

            char[] symbols = {'q', 'w', 'e', 'r', 't', 'y'};
            for (int i = 0; i < symbols.length; i++) {
                // Запись каждого символа в текстовый файл
                fio1.write(symbols[i]);
            }
//            int size = input.available();
//            for (int i = 0; i < size; i++) {
//                // Чтение текстового файла посимвольно
//                System.out.print((char) input.read() + " ");
//            }
        }catch (IOException e ){

        }
    }
}

