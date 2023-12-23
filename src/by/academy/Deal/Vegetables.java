package by.academy.Deal;

public class Vegetables extends Product {
    private String type;

    public Vegetables(String name, String type, int quantity, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public double calculateDiscount() {
        double discount = 3;
        if (quantity > 8) {
            discount = 3;
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
