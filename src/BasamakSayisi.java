import java.util.Scanner;
public class BasamakSayisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, bsmksysi = 0, tplm = 0;

        System.out.println("Sayi giriniz : ");
        sayi = input.nextInt();

        while (sayi != 0){
            tplm += (sayi % 10);
            sayi /= 10;
            ++bsmksysi;
        }
        System.out.println("Basamak sayisi : " +bsmksysi);
        System.out.println("Basamak sayilarinin toplami : " +tplm);
    }

}
