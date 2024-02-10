package by.academy;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.stream.Collectors;

public class TEST {
        private final static Random RANDOM = new Random();

        public static void main(String[] args) throws IOException
    {
        int randomRange = random(0, 200);
        File dir = new File("src/файл/");
        if (!dir.exists()) {
            dir.mkdirs();
        }
            String[] dirNames = {"src/файл/"};
            String[] fileNames = {"src/файл/filename_"};
            for (int i = 0; i < randomRange; i++) square(fileNames[i]);
        for (int i = 0; i < randomRange; i++) new File(dirNames[i]).mkdirs();
        }

        private static void square(String fileName) throws IOException {
            for (int i = 1; i <= 100; i++) {
                byte[] content = RANDOM.ints(random(1, 100), 1, 100)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" ")).getBytes();
                Files.write(Paths.get(fileName + i + ".txt"), content);
            }
        }

       private static int random(int min, int max) {
            return RANDOM.nextInt(max-min+1)+min;
        }

    }

