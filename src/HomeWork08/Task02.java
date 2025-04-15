package HomeWork08;

public class Task02 {
    public static void main(String[] args) {

        System.out.println("Задание 2");
        int[] payments = new int[5];
        payments[0] = 3;
        payments[1] = 5;
        payments[2] = 6;
        payments[3] = 8;
        payments[4] = 1;
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

    }
}
