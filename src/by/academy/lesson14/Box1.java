package by.academy.lesson14;

import by.academy.lesson8.Box;
import by.academy.lesson8.HeavyBox;

import java.util.ArrayList;
import java.util.List;

public class Box1 {
    public static void main(String[] args) {
        List<HeavyBox> boxList = new ArrayList<>();

        HeavyBox color = new HeavyBox("123");
        boxList.add(color);

//        //for(int i = 0; i< boxList.size(); i++) {
            System.out.println(boxList);

        }

    }
//}