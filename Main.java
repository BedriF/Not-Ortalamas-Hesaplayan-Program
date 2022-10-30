
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int kimya,turkce,tarih,müzik,fizik;
        float ortalama;
        String a ;
        Scanner input = new Scanner(System.in);
        System.out.println("Fizik sınav notunu giriniz.");
        fizik=input.nextInt();
        System.out.println("Kimya sınav notunu git giriniz.");
        kimya=input.nextInt();
        System.out.println("Türkçe sınav notunu git giriniz.");
        turkce=input.nextInt();
        System.out.println("Tarih sınav notunu git giriniz.");
        tarih=input.nextInt();
        System.out.println("Müzik sınav notunu git giriniz.");
        müzik=input.nextInt();
        ortalama = fizik+kimya+turkce+tarih+müzik;
        ortalama/=5;
        a = ortalama>=60 ? "Geçtiniz":"Kaldınız";
        System.out.println(a);
    }
}