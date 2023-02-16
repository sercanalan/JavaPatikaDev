import java.util.Scanner;

public class Basamak_sayıları_toplamı_hesaplayan_program {
    public static void main(String[] args) {
        // Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        // Örnek : 1643 = 1 + 6 + 4 + 3 = 14
        Scanner scan = new Scanner(System.in);
        System.out.print("Girilen Sayı: ");
        int number = scan.nextInt();

        int temp = number;
        int sum = 0;
        while (temp != 0){
            sum += (temp % 10);
            temp /= 10;
        }
        System.out.println("Basamak Sayıları Toplamı: "+sum);
    }
}
