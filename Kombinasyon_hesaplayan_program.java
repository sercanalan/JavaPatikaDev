import java.util.Scanner;

public class Kombinasyon_hesaplayan_program {
    public static void main(String[] args) {
        // N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
        // C(n,r) = n! / (r! * (n-r)!)
        Scanner scan = new Scanner(System.in);
        int n_faktoriyel = 1;
        int r_faktoriyel = 1;
        int farklari_faktoriyel = 1;

        System.out.print("Ana kümenin eleman sayısı (N): ");
        int n = scan.nextInt();

        System.out.print("Alt kümenin eleman sayısı (r): ");
        int r = scan.nextInt();


        for (int i = 1; i <= n; i++){
            n_faktoriyel *= i;
        }
        for (int i = 1; i <= r; i++){
            r_faktoriyel *= i;
        }
        for (int i = 1; i <= (n-r); i++){
            farklari_faktoriyel *= i;
        }
        int combination = n_faktoriyel / (r_faktoriyel * farklari_faktoriyel);
        System.out.println("n!= "+n_faktoriyel);
        System.out.println("r!= "+r_faktoriyel);
        System.out.println("(n-r)!= "+farklari_faktoriyel);
        System.out.println("C(n,r)= "+combination);

    }
}
