package WH;

public class CatService {
    public static void main(String[] args){
        Cat murka = new Cat();
        murka.setNickname("Murka");
        System.out.println(murka);
        murka.spit();
        murka.grow();
        murka.eat();
       murka.walk();
    }
}
