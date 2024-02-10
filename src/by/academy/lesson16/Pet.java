package by.academy.lesson16;

import java.util.HashMap;
import java.util.Map;

public class Pet {
    public String name;

    public static void main(String[] args) {
        HashMap<String, Pet> zoo = new HashMap<>();
        zoo.put("Oop", new Cat("Bars"));
        zoo.put("Oop", new Dog("asdas"));
        zoo.put("Oop", new Parrot("askdj"));
        for (String key : zoo.keySet()) {
            System.out.println(key);
        }
        for (Pet value : zoo.values()) {
            System.out.println(value);


        }
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}

