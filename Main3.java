import java.util.Scanner;
public  class Main3 {
    public static void main(String[] args) {
        Scanner gav= new Scanner(System.in);
        int num1=gav.nextInt();
        int num2=gav.nextInt();
        int num3=gav.nextInt();
        int num4=gav.nextInt();
        int min =num1;
        if(min>num2) {
            min = num2;
        }
        else if (min>num3) {
            min = num3;
        } else if (min>num4) {
            min= num4;
        }


        System.out.println(min);
    }
}
