import java.util.Scanner;

public class SayidanKucukKuvvetleri {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        number = input.nextInt();

        for (int i=0 ; i<number;i++){
            if (i%20==0){
                System.out.println(i);
            }
        }
    }
}
