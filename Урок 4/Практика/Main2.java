
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner gav= new Scanner(System.in);
        System.out.println("lyboe chislo");
        int t = gav.nextInt();
        int h = 0;
        while (h <= t) {
            System.out.println(h=h);
            h++;
        }
        h = 0;
        do {
            System.out.println(h);
            h++;

        }while (h <= t);
        for (h = 0;h <= t;h++){
            System.out.println(h);
        }
        gav.close();
    }
}