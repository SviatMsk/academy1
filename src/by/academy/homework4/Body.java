package by.academy.homework4;
//1. Создать класс Body.
//        2. Создать внутренний класс Heart, объект которого создается в конструкторе Body.
//        Реализовать метод live (в классе Heart), в котором вы в цикле пробегаетесь от нуля до Integer.MAX_VALUE
//        и на каждую 100 итерацию выводите на экран "Knock-knock-knockin' on heaven's door".
//        3. Создать внутренний класс Lungs, объект которого создается в конструкторе Body.
//        Реализовать метод live (в классе Lungs), в котором вы в цикле пробегаетесь от нуля до Integer.MAX_VALUE
//        и на каждую 50 итерацию выводите на экран "breathe in", а на каждую 100 - "breathe out".
//        4. Реализовать метод live в классе Body, в котором мы запускаем метод live на объекте lungs (lungs.live())
//        и метод live на объекте heart (heart.live()).
//        После отработки обоих методов выведем на экран:
//        "You stand on the shore and feel the salty smell of the wind that blows from the sea.
//        And I believe that you are free, and life has only begun.".

public class Body {
    public static void main(String[] args) {
        Body body = new Body();
        Heart heart = body.new Heart();
        Lungs lungs = body.new Lungs();
        lungs.live();
        heart.live();
        System.out.println("You stand on the shore and feel the salty smell of the wind that blows from the sea. And I believe that you are free, and life has only begun");
    }
    class Heart {
        public void live() {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                if (i % 100 == 0) {
                    System.out.println("Knock-knock-knockin' on heaven's door");

                }
            }
        }
    }
    class Lungs {
        public void live() {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                if (i % 50 == 0) {
                    System.out.println("breathe in");
                }
                if (i % 100 == 0) {
                    System.out.println("breathe out");
                }
            }
        }

    }
}