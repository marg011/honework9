public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int [] accountBook = generateRandomArray();
        int sum = 0;
        for (int element : accountBook){
            sum = sum + element;
        }
        System.out.println("The sum of expenses for a month is " + sum + "rubles.");


    }

    public static void task2 () {
        System.out.println("Задача 2");
        int [] accountBook = generateRandomArray();
        int min = 200_000;
        int max = 100_000;
        for (int element : accountBook){
            if (min > element){
                min = element;
            }
            if (max < element){
                max = element;
            }
        }
        System.out.println("Min sum of expenses is " + min + " rubles. Max sum of expenses is " + max + " rubles.");
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int [] accountBook = generateRandomArray();
        double sum = 0;
        double days = 30;
        for (int element : accountBook){
            sum = sum + element;
        }
        double mean = sum/days;
        System.out.println("the mean of expenses is " + mean + " rubles.");

    }

    public static void task4 () {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }

    }
}