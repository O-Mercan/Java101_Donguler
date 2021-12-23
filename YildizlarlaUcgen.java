import java.util.Scanner;

public class YildizlarlaUcgen {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz.: ");
        n = input.nextInt();

        for (int i=1;i<=n;i++){

            for(int k=1; k<=(n-i); k++){
                System.out.print(" ");
            }

            for(int j=1; j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int l=n-1; l>1;l--){

            for(int b=(n-l); b>=1; b--){
                System.out.print(" ");
            }
            for(int m=(2*l)-1; m>=1;m--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
