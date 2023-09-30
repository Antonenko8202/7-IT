import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 == num2 || num1 == num3 || num2 == num3) {
            if (num1 == num2) {
                System.out.println("Пара: " + num1 + " и " + num2);
            }
            if (num1 == num3) {
                System.out.println("Пара: " + num1 + " и " + num3);
            }
            if (num2 == num3) {
                System.out.println("Пара: " + num2 + " и " + num3);
            }
        } else {
            System.out.println("Нет одинаковых чисел.");
        }
    }
}
