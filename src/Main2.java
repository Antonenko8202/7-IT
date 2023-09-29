import java.util.Scanner;
public  class Main2 {
    public static void main(String[] args) {
        Scanner gav= new Scanner(System.in);
        int num1=gav.nextInt();
        int num2=gav.nextInt();
        int num3=gav.nextInt();
        int max =num1;
        if(max< num2) {
            max = num2;
        }
        else if (max<num3) {
            max = num3;
        }

        System.out.println(max);
    }
}
