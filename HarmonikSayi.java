import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {

        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        number = input.nextInt();

        double result=0;

        for (int i=1;i<=number;i++){
            result+=(1.0/i);
            System.out.println(result);
        }
        System.out.println(result);

    }
}
