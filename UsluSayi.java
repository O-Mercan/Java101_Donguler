import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
         int n1, n2, total;

         Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("Üssü giriniz: ");
        n2 = input.nextInt();

        total=1;
        for (int i=1;i<=n2;i++){
            total = total*n1;
        }
        System.out.println(total);
    }
}
