package HomeWork08;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] payments = new int[5];
        payments[0] = 3;
        payments[1] = 5;
        payments[2] = 6;
        payments[3] = 8;
        payments[4] = 1;
        int sum = 0;
        for (int element : payments) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

    }
}
