import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое имя: ");
        String name1 = scanner.nextLine();

        System.out.print("Введите второе имя: ");
        String name2 = scanner.nextLine();

        if (name1.equals(name2)) {
            System.out.println("Имена идентичные");
        } else if (name1.length() == name2.length()) {
            System.out.println("Длина имен одинаковая");
        }
    }
}