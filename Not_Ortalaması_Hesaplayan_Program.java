import java.util.Scanner;

public class Not_Ortalaması_Hesaplayan_Program {

    public static void main(String[] args) {
        double mat,fizik,kimya,turkce,tarih,muzik;

        Scanner scan = new Scanner (System.in);

        System.out.print("Matematik Notunuz: ");
        mat = scan.nextDouble();

        System.out.print("Fizik Notunuz: ");
        fizik = scan.nextDouble();

        System.out.print("Kimya Notunuz: ");
        kimya = scan.nextDouble();

        System.out.print("Türkçe Notunuz: ");
        turkce = scan.nextDouble();

        System.out.print("Tarih Notunuz: ");
        tarih = scan.nextDouble();

        System.out.print("Müzik Notunuz: ");
        muzik = scan.nextDouble();

        double ortalama = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Ortalamanız: "+ortalama);

        String durum = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);

    }







}
