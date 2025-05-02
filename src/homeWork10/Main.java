package homeWork10;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание 1");
        checkLeapYear(2100);

        System.out.println();
        System.out.println("Задание 2");

        String osName = "iOS";
        printInfoAboutVersion(0, 2010);

        System.out.println();
        System.out.println("Задание 3");

        int deliveryDistance1 = 110;
        System.out.println(calculateDeliveryDays(deliveryDistance1));
    }

    // Метод задания 1
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0) && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год високосный ");
        } else {
            System.out.println(year + " год не високосный ");
        }
// Метот задания 2
    }

    public static void printInfoAboutVersion(int type, int year) {
        String name;
        if (type == 0) {
            name = "IOS";
        } else {
            name = "Android";
        }
        int currentYear = LocalDate.now().getYear();
        if (year < currentYear) {
            System.out.println(" Установите облегченную версию " + name);
        } else {
            System.out.println(" Установить обычную версию " + name);
        }

    }

    // Метот задания 3
    public static int calculateDeliveryDays(int deliveryDistance) {
        int count = 1;
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            count = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            count = 3;
        } else if (deliveryDistance > 100) {
            return count;
        }
        return count;
    }

}
