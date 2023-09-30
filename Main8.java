import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите дату рождения (в формате ДД.ММ.ГГ): ");
        String y = scanner.nextLine();

        System.out.println("Меня зовут " + name + ". Я родился " + y + ".");
    }
}
