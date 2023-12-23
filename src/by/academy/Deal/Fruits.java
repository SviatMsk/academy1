package by.academy.Deal;

public class Fruits extends Product {
    private String type;

    public Fruits(String name, String type, int quantity, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double calculateDiscount() {
        double discount = 1;
        if (quantity > 15) {
            discount = 5;
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
