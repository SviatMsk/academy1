package by.academy.lesson8;
public class HeavyBox extends Box {

    private double weight;

    public HeavyBox() {
        super();
        System.out.println("HeavyBox");
    }

    public HeavyBox(String s) {
        super();
        System.out.println("HeavyBox" + s);
    }

    @Override
    public double calcVolume() {
        return super.calcVolume() - 1;
    }


    public HeavyBox(double weight, double height, double depth) {
        super(weight, height, depth);
    }

}