package com.company;

import java.util.Scanner;

public class Uc_ve_dorde_tam_bolunen_sayilarin_ortalamasi {
    public static void main(String[] args) {
        // Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
        // 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        Scanner input = new Scanner(System.in);

        System.out.print("Girilen Sayı: ");
        int number = input.nextInt();

        int sum = 0;
        int count = 0;

        for (int i=0; i <= number; i++){
            if (i % 3 == 0 || i % 4 == 0 ){
                sum += i;
                count++;
            }
        }
        System.out.println(sum);
        double average = (double) sum / count;
        System.out.println(average);

    }
}
