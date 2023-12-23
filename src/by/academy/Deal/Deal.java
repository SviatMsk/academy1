package by.academy.Deal;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Deal {
    private final User seller;
    private final  User buyer;
    private final Product[] products;
    private LocalDate dealDate;

    public Deal(User buyer, User seller, Product[] products, LocalDate dealDate) {
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
        this.dealDate = dealDate;
    }

    public LocalDate getDealDate() {
        return dealDate;
    }

    public void setDealDate(LocalDate dealDate) {
        this.dealDate = dealDate;
    }

    private void transferMoney() {
        buyer.setMoney(buyer.getMoney() - calculateFullPrice());
        seller.setMoney(seller.getMoney() + calculateFullPrice());
    }

    private void printBill() {
        System.out.println("Цена покупок");
        for (Product p : products) {
            if (p == null) {
                continue;
            }
            System.out.println(p + " цена со скидкой " + p.calculatePrice());
        }
        System.out.println(" Общая стоимость со скидкой " + calculateFullPrice());
    }

    public double calculateFullPrice() {
        if (products == null) {
            return 0;
        }
        double result = 0;
        for (Product p : products) {
            if(p == null){
                continue;
            }
            result += p.calculatePrice();
        }
        return result;
    }

    public void submit() {
        double price = calculateFullPrice();
        if (buyer.hasEnoughMoney(price)) {
            printBill();
            transferMoney();
            System.out.println("Сделка совершена");
        } else {
            System.out.println(" У покупателя нет столько денег: " + price);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Deal deal = (Deal) o;

        if (!Objects.equals(seller, deal.seller)) return false;
        if (!Objects.equals(buyer, deal.buyer)) return false;
        if (!Arrays.equals(products, deal.products)) return false;
        return Objects.equals(dealDate, deal.dealDate);
    }

    @Override
    public int hashCode() {
        int result = seller != null ? seller.hashCode() : 0;
        result = 31 * result + (buyer != null ? buyer.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(products);
        result = 31 * result + (dealDate != null ? dealDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Deal{" +
                "seller=" + seller +
                ", buyer=" + buyer +
                ", products=" + Arrays.toString(products) +
                ", dealDate=" + dealDate +
                '}';
    }
}

