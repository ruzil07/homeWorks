package homeWork10;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание 1");
        String res = checkLeapYear(2100);
        System.out.println(res);

        System.out.println();
        System.out.println("Задание 2");

        String osName = "iOS";
        getClientOS(0, 2010);

        System.out.println();
        System.out.println("Задание 3");

        int deliveryDistance1 = 110;
        String result3 = calculateDeliveryDays(deliveryDistance1);
        System.out.println(result3);
    }

    // Метод задания 1
    public static String checkLeapYear(int year) {
        if ((year % 4 == 0) && year % 100 != 0 || year % 400 == 0) {
            return year + " год високосный ";
        } else {
            return year + " год не високосный ";
        }
// Метот задания 2
    }

    public static void getClientOS(int type, int year) {
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
    public static String calculateDeliveryDays(int deliveryDistance) {
        int count = 1;
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            count = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            count = 3;
        } else if (deliveryDistance > 100) {
            return "Доставки нет";
        }
        return "Потребуется дней: " + count;
    }

}
