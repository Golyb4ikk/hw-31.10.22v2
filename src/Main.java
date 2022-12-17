
public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    //zadacha 1
    public static void main(String[] args) {
        int[] otchet = generateRandomArray();
        int summa = 0;
        for (int i = 0; i < otchet.length; i++) {
            summa = summa + otchet[i];
        }
        System.out.println("Сумма трат за месяц составила " + summa + " рублей");
        //zadacha 2
        int min = 1000000;
        int max = 0;
        for (int i = 0; i < otchet.length; i++) {
            if (otchet[i] > max) {
                max = otchet[i];
            }
        }
        for (int i = 0; i < otchet.length; i++) {
            if (otchet[i] < min) {
                min = otchet[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей и максимальная сумма трат за день составила " + max + " рублей");

        //zadacha 3
        double sredniyDoxod = 0;
        for (int i = 0; i < otchet.length; i++) {
            sredniyDoxod = sredniyDoxod + otchet[i];
        }
        sredniyDoxod = sredniyDoxod / 30;
        System.out.println("Средняя сумма трат за месяц составила " + sredniyDoxod + " рублей");
        //zadacha 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char puzir = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = puzir;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);

        }
    }
}
