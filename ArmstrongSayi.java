import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {

        int number ;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz.");
        number = input.nextInt();

        int tempNumber=number;
        int basValue;
        int result=0;



        while(tempNumber!=0){
            basValue=tempNumber%10;
            result+=basValue;
            tempNumber/=10;

        }
        System.out.println(number + " sayısının basamakları toplamı: "+result);

    }
}
