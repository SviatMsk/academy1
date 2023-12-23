package by.academy.Deal;

public class Cloth extends Product {
    private String type;

    public Cloth(String name, String type, int quantity, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double calculateDiscount() {
        double discount = 7;
        if (quantity > 20) {
            discount = 10;
        }
        return discount;
    }

    @Override
    public double calculatePrice() {
        return price * calculateDiscount() * quantity;
    }

    @Override
    public String toString() {
        return name + " " + type + " по цене " + price + " в количестве " + quantity;
    }
}






