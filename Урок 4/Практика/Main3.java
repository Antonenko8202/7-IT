
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner gav= new Scanner(System.in);
        System.out.println("lyboe chislo");
        int t = gav.nextInt();
        int h = 0;
        while (h <= t) {
            System.out.println(t=t);
            t--;
        }
        h = 0;
        do {
            System.out.println(t);
            t--;

        }while (h <= t);
        for (h = 0;h <= t;h++){
            System.out.println(h);
        }
        gav.close();
    }
}