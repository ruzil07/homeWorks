package homeWork10;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println( "Задание 1");
        String res = checkLeapYear(2100);
        System.out.println(res);
    }

    public static String checkLeapYear(int year) {
        if ((year % 4 == 0) && year % 100 != 0 || year % 400 == 0) {
            return year + " год високосный ";
        } else {
            return year + " год не високосный ";
        }
    }
}
