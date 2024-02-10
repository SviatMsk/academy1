package by.academy.lesson2;

public class Birdapp {
    public static void main(String[] args) {
        Bird golub = new Bird();
        System.out.println(golub.size);
            golub.size = "Мидиум";
            System.out.println(golub.size);
        Bird vorobei = new Bird("мелкий");
            vorobei.size = "Крупный";
        System.out.println(vorobei.size);
            //String vorobeiSize = vorobei.getSize();
            //System.out.println(vorobeiSize);
        //String vorobeiType = vorobei.getType();
  //System.out.println(vorobeiType);





    }
}
