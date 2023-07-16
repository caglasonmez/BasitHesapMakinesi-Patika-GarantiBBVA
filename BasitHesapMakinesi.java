package CaglaSonmez;

import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, select;
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        switch (select) {
            case 1 :
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2 :
                System.out.println("Çıkarma: " + (n1 - n2));
                break ;
            case 3 :
                System.out.println("Çaprma: " + (n1 * n2));
                break ;
            case 4 :
                System.out.println("Bölme: " + (n1 / n2));
                break ;
            default :
                System.out.println("Yanlış seçim yaptınız.");
                break;
        }
    }

}
