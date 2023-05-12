import java.util.Scanner;
public class notHesapla {
    public static void main(String[] args) {
      // değişkenleri oluştur
        int matematik,fizik,kimya,turkce,tarih,muzik;

        // scanner sınıfı tanımlandık
        Scanner bilgi = new Scanner(System.in);
        //kullanıcıdan biligileri al

        System.out.print("Matematik notunu giriniz : ");
        matematik = bilgi.nextInt();

        System.out.print("Fizik notunu giriniz : ");
        fizik = bilgi.nextInt();

        System.out.print("Kimya notunu giriniz : ");
        kimya= bilgi.nextInt();

        System.out.print("Türkçe notunu giriniz : ");
        turkce = bilgi.nextInt();

        System.out.print("Tarih notunu giriniz : ");
        tarih= bilgi.nextInt();

        System.out.print("Müzik notunu giriniz : ");
        muzik = bilgi.nextInt();

        int total = (matematik+fizik+kimya+turkce+tarih+muzik);
        double sonuc =total/6;

        boolean kosul1 = sonuc >=60.0;


        String karne = kosul1 ? "Sınıfı geçtiniz" : "Sınıfta kaldınız" ;
        System.out.print(karne);





    }
}
