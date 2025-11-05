/*Ad Soyad: Ayşe Eslem ÇEKİCİ
Öğrenci No:250541026
Tarih:5.11.2025
Açıklama:Gorev3 Maas Hesaplayıcı
Kullanıcıdan alınan brüt maaş ve çalışma saatleriyle sistemde belirli kesintilere tabi tutarak
 toplam geliri, günlük net kazancı ve saatlik net kazancı ekrana yazdırır.
 */

import java.util.Scanner;
public class MaasHesap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Sabitler
            final double SGK_ORANI = 0.14;
            final double GELIR_VERGISI_ORANI = 0.15;
            final double DAMGA_VERGISI_ORANI = 0.00759;
            final double MESAI_KATSAYISI = 1.5;

            //Görev tanımında direkt sabit olarak verilmeyen tanımlar içerisinden çıkardığımız sabitler
            final int AYLIK_STANDART_SAAT = 160;
            final int AYLIK_IS_GUNU = 22;
            final int GUNLUK_CALISMA_SAATI = 8;

        System.out.println("Maas Hesaplayici");
        System.out.print("Ad:");
        String ad=input.nextLine();
        System.out.print("Soyad:");
        String soyad=input.nextLine();
        System.out.print("Aylık Brut Maas(TL):");
        double brutMaas=input.nextDouble();
        System.out.print("Haftalik Calisma Saati:");
        int haftalikSaati=input.nextInt();
        //Mesai saati normal çalışma saati dışında çalışılan saattir.
        System.out.print("Mesai Saati Sayisi:");
        int mesaiSaati=input.nextInt();

        //Hesaplamalar
        double mesaiUcreti = (brutMaas / AYLIK_STANDART_SAAT) * mesaiSaati * MESAI_KATSAYISI;
        double toplamGelir = brutMaas + mesaiUcreti;

        double sgkKesintisi = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgkKesintisi + gelirVergisi + damgaVergisi;

        double netMaas = toplamGelir - toplamKesinti;

        double kesintiOrani = (toplamKesinti / toplamGelir)*100;
        double gunlukNetKazanc = netMaas / AYLIK_IS_GUNU;
        double saatlikNetKazanc = gunlukNetKazanc / GUNLUK_CALISMA_SAATI;

        System.out.println("***MAAS BORDROSU***");
        System.out.printf("Çalışan:%s%n", ad);
        System.out.printf("Soyad:%s%n",soyad);

        System.out.println("GELİRLER:");
        System.out.printf("  Brüt Maaş: %.2f TL%n", brutMaas);
        System.out.printf("  Mesai Ücreti(%d saat): %.2f TL%n", mesaiSaati, mesaiUcreti);
        System.out.printf("  TOPLAM GELİR: %.2f TL%n", toplamGelir);

        System.out.println("\nKESİNTİLER:");
        System.out.printf("  SGK Kesintisi(%%14.0): %.2f TL%n", sgkKesintisi);
        System.out.printf("  Gelir Vergisi(%%15.0): %.2f TL%n", gelirVergisi);
        System.out.printf("  Damga Vergisi(%%0.76): %.2f TL%n", damgaVergisi);
        System.out.printf("  TOPLAM KESİNTİ: %.2f TL%n", toplamKesinti);

        System.out.printf("NET MAAŞ: %.2f TL%n", netMaas);

        System.out.println("\nİSTATİSTİKLER:");
        System.out.printf(" Kesinti Oranı: %.1f%n", kesintiOrani);
        System.out.printf(" Günlük Net Kazanç: %.2f TL%n", gunlukNetKazanc);
        System.out.printf(" Saatlik Net Kazanç: %.2f TL%n", saatlikNetKazanc);

        input.close();
    }
}
