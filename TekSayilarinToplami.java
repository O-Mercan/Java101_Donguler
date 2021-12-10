import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {
        int number;
        boolean isEven = true;
        int total=0;
        Scanner input = new Scanner(System.in);

        while (isEven) {
            System.out.print("Sayı giriniz: ");
            number = input.nextInt();
            if (number%4==0){
                total +=number;
            }

            if (number %2==1){
                isEven = false;
            }
        }
        System.out.print("4'ün katı olan sayıların toplamı: "+total);

    }
}
