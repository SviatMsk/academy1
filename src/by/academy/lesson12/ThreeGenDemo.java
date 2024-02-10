package by.academy.lesson12;

import by.academy.lesson9.Animal;
import by.academy.lesson9.Cat;

public class ThreeGenDemo {
    public static void main(String[] args) {

        ThreeGen<String, Animal, Integer> threeGen = new ThreeGen<>("alalal", new Cat(), 10);
        threeGen.printAll();
        threeGen.printT();
        System.out.println(threeGen.getT());
    }
}
