package by.academy.Deal;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ДОБРО ПОЖАЛОВАТЬ В МАГАЗИН ");
        System.out.println("Для начала Введите свое имя");
        String buyerName = sc.nextLine();
        LocalDate buyerBirthdate = checkBirthDate();
        LocalDate sellerBirthDate = LocalDate.parse("19-06-1988", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        User buyer = new User(buyerName, 1000, buyerBirthdate);
        User seller = new User("Миша", 1000, sellerBirthDate);
        BasketСhange basketchange = getProducts();
        System.out.println("===============================");
        System.out.println("Информация о сделке");
        Deal deal = new Deal(buyer, seller, basketchange.getProducts(), LocalDate.now());
        deal.submit();
        System.out.println("===============================");
        System.out.println(buyer);
        System.out.println(seller);
    }

    private static LocalDate checkBirthDate() {

        Scanner sc1 = new Scanner(System.in);
        DateTimeFormatter formatter;
        LocalDate dateOfBirth;
        for (; ; ) {
            System.out.println("Введите свою дату рождения в формате (dd/MM/yyyy) или (dd-MM-yyyy)");
            String buyerDate = sc1.nextLine();
            Validator date = new ValidateDate1();
            Validator date2 = new ValidateDate2();
            if (date.validate(buyerDate)) {
                formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                dateOfBirth = LocalDate.parse(buyerDate, formatter);
                break;
            } else if (date2.validate(buyerDate)) {
                formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                dateOfBirth = LocalDate.parse(buyerDate, formatter);
                break;
            } else {
                System.out.println("Неверно введена дата");
            }
        }
        return dateOfBirth;

    }

    private static BasketСhange getProducts() {
        Scanner sc2 = new Scanner(System.in);
        BasketСhange basketchange = new BasketСhange();
        int quantity;
        int index;
        boolean cycle = true;
        System.out.println("Сегодня в продаже");
        System.out.println("1-ткань, 2-овощи, 3-фрукты, 0-остановить");
        while (cycle) {
            String sort = sc2.next();
            switch (sort) {
                case "1":
                    System.out.println("Введите колличество");
                    quantity = sc2.nextInt();
                    System.out.println("Вы выбрали ткань в количестве " + quantity);
                    basketchange.add(new Cloth("ткань", "шёлк", quantity, 7));
                    continue;
                case "2":
                    System.out.println("Введите колличество");
                    quantity = sc2.nextInt();
                    System.out.println("Вы выбрали фрукты в количестве " + quantity);
                    basketchange.add(new Fruits("фрукты", "яблоки", quantity, 15));
                    continue;
                case "3":
                    System.out.println("Введите колличество");
                    quantity = sc2.nextInt();
                    System.out.println("Вы выбрали овощи в количестве " + quantity);
                    basketchange.add(new Vegetables("овощи", "перец", quantity, 20));
                    continue;
                case "0":
                    cycle = false;
            }
        }

        System.out.println("\nу Вас в корзине ");
        basketchange.printProducts();
        System.out.println("нужно удалить позицию  1-да, 0-нет");
        String position = sc2.next();
        if (position.equals("1")) {
            System.out.println("Введите позиции для отмены   0-стоп");
            basketchange.printProducts();
            for (; ; ) {
                index = sc2.nextInt();
                if (index == 0) {
                    break;
                } else {
                    basketchange.delete(index - 1);
                }
            }
        }
        return basketchange;
    }
}
