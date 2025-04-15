package HomeWork08;

public class Task04 {
    public static void main(String[] args) {
        System.out.println("Задание 4");
        int[] payments = new int[5];
        payments[0] = 3;
        payments[1] = 5;
        payments[2] = 6;
        payments[3] = 8;
        payments[4] = 1;
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
