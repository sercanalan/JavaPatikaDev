import java.util.Scanner;

public class Üslü_Sayı_Hesaplayan_Program {
    public static void main(String[] args) {
        // Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
        Scanner scan = new Scanner(System.in);

        System.out.print("Taban sayısı: ");
        int n = scan.nextInt();

        System.out.print("Üs sayısı: ");
        int r = scan.nextInt();

        int result = 1;
        for (int i = 1; i <=r; i++){
            result *= n;
        }
        System.out.println(n+" üssü "+r+" = "+result);
    }
}
