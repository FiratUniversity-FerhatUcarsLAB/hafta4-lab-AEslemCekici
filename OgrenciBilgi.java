/*Ad Soyad: Ayşe Eslem ÇEKİCİ
Öğrenci No:250541026
Tarih:28.10.2025
Açklama:Görev1 Öğrenci Bilgi Sistemi
Kullanıcıdan alınan ad, soyad, öğrenci no, yaş ve GPA bilgilerini ekrana düzenli bir şekilde yazdırır.
 */
import java.util.Scanner;
public class OgrenciBilgi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.print("Ad:");
    String ad=input.nextLine();

    System.out.print("Soyad:");
    String soyad=input.nextLine();

    System.out.print("Ögrenci Numarası:");
    int ogrencinumarası=input.nextInt();
    System.out.print("Yaş:");
    int yas=input.nextInt();

    System.out.print("GPA:");
    double gpa=input.nextDouble();
//Baslik
    System.out.println("Öğrenci Bilgileri");
//Ad Soyad
    System.out.printf("Adı Soyadı:%s%n", ad, soyad);
//Numara
    System.out.printf("Numarası: %d%n", ogrencinumarası);
//Yas
    System.out.printf("Yaşı:%d%n", yas);
//GPA girisi virgülle olacak sekilde
    System.out.printf("GPA:%.2f%n", gpa);


input.close();

    }
}
