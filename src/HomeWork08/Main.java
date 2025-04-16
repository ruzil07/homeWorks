package HomeWork08;

public class Main {
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

        System.out.println("Задание 2");
        int maxPayments = payments[0];
        int minPayents = payments[0];
        for (int i = 0; i < payments.length; i++) {
            if (payments[i] > maxPayments) {
                maxPayments = payments[i];
            }
            if (payments[i] < minPayents) {
                minPayents = payments[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayents + " рублей. Максимальная сумма" +
                " трат за неделю составила " + maxPayments + " рублей ");
        System.out.println("Задание 3");
        int totalPayents = 0;
        for (int i : payments) {
            totalPayents += i;
        }
        double averagePayents = (double) totalPayents / payments.length;
        System.out.println("Средняя сумма трат за месяц составила " + averagePayents + " рублей");
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println(reverseFullName);

        for (int i = 0; i < reverseFullName.length / 2; i++) {
            int index = reverseFullName.length - 1 - i;

            char value = reverseFullName[i];
            reverseFullName[i] = reverseFullName[index];
            reverseFullName[index] = value;
        }
        System.out.println(reverseFullName);

    }
}