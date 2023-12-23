package by.academy.Deal;

import java.time.LocalDate;
import java.util.Objects;

public class User {
    private String name;
    private LocalDate dateOfBirth;
    private double money;

    public User(String name, double money, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (Double.compare(user.money, money) != 0) return false;
        if (!Objects.equals(name, user.name)) return false;
        return Objects.equals(dateOfBirth, user.dateOfBirth);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        temp = Double.doubleToLongBits(money);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public boolean hasEnoughMoney(double price) {
        return money >= price;
    }

    @Override
    public String toString() {
        return name + " " + dateOfBirth + " количество денег " + money;
    }
}

