import java.util.Scanner;

public class Girilen_Sayıdan_Küçük_4_ve_5in_Kuvvetleri {
    public static void main(String[] args) {
        // Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
        Scanner scan = new Scanner(System.in);

        System.out.print("Sınır Sayısı: ");
        int number = scan.nextInt();

        System.out.println("********** 4'ün kuvvetleri **********");
        for (int i = 1; i <= number; i*=4){
            System.out.println(i);
        }

        System.out.println("********** 5'in kuvvetleri **********");
        for (int i = 1; i <= number; i*=5){
            System.out.println(i);
        }
    }
}
