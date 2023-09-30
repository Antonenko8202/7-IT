import java.util.Scanner;
import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int[] numbers = {num1, num2, num3};

        Arrays.sort(numbers);
        int temp;
        temp = numbers[0];
        numbers[0] = numbers[2];
        numbers[2] = temp;

        System.out.println(" " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
    }
}