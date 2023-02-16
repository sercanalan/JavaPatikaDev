import java.util.Scanner;

public class Çift_ve_4ün_katlarını_toplayan_program {
    public static void main(String[] args) {
        // Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
        // girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
        Scanner input = new Scanner(System.in);

        int number;
        int sum = 0;
        int counter = 1;
        do {
            System.out.println();
            System.out.print("Bir Sayı Giriniz: ");
            number = input.nextInt();
            if (number % 2 == 0 && number % 4 == 0){
                sum += number;
                System.out.print(counter+". sayı >>> "+number);
                counter++;
            }
        } while (number % 2 == 0);
        System.out.println("Toplam = "+sum);
    }

}
