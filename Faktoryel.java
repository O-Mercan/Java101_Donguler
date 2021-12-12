import java.util.Scanner;

public class Faktoryel {
    public static void main(String[] args) {

        int n1, n2, f1, f2, comb;

        Scanner input = new Scanner(System.in);

        System.out.print("N elemanlı bir kümenin elemanları ile oluşturulacak R elemanlı \nfarklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.");
        System.out.println("");
        System.out.print("N sayısını giriniz: ");
        n1 = input.nextInt();
        System.out.print("R sayısını giriniz: ");
        n2 = input.nextInt();

        f1=1;
        for (int i =1; i<=n1; i++){
            f1 = f1*i;
        }

        f2=1;
        for (int i =1; i<=n2; i++){
            f2 = f2*i;
        }


        comb =  f1 / (f2*(n1-n2));

        System.out.print(n1+"'in "+n2+"'li kombinasyonu C("+n1+","+n2+"): "+comb);


    }
}
