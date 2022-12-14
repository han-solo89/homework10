import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) {

    }

    int[] arr = generateRandomArray();

    public static int @NotNull [] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int sum = 0;
        int[] arr = generateRandomArray();
        for (int value : arr) {
            sum += value;
        }
        System.out.println("сумма трат за месяц" + sum);
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];

        for (int element : arr) {
            System.out.println("минимальные затраты за день" + min);
            System.out.println("максимальные затраты за день" + max);
        }

    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum / (float) arr.length);
    }

    public static void task4() {
        char[] reverseFullName = {'n' , 'a' , 'v' , 'I' , ' ', 'v', 'o' , 'n' , 'a' ,'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.println(reverseFullName[i]);

        }
    }
}



