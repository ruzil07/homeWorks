package HomeWork08;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("Задание 3");
        int[] payments = new int[5];
        payments[0] = 3;
        payments[1] = 5;
        payments[2] = 6;
        payments[3] = 8;
        payments[4] = 1;
        int totalPayents = 0;
        for (int i : payments) {
            totalPayents += i;
        }
        double averagePayents = (double) totalPayents / payments.length;
        System.out.println("Средняя сумма трат за месяц составила " + averagePayents + " рублей");

    }
}
