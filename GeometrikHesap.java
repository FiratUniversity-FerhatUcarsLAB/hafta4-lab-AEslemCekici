/*Ad Soyad: Ayşe Eslem ÇEKİCİ
Öğrenci No:250541026
Tarih:4.11.2025
Açklama:Gorev2 Geometrik Hesaplayıcı
Kullanıcıdan alınan yarıçap ile dairenin çevresini, alanını, yarıçapını hesaplayıp yazdırır.
Aynı zamanda girilen yarıçapı kullanarak kürenin hacmini ve yüzey alaını hesaplayıp yazdırır.
 */


import java.util.Scanner;
public class GeometrikHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;
System.out.println("*****GEOMETRIK HESAPLAYICI*****");
System.out.print("Dairenin yaricapini giriniz:");
    double yaricap=input.nextDouble();

//Daireyle ilgili hesaplamalar
    double daireCevre = 2*PI*yaricap;

//Math.pow kullanmadan
    double daireAlan = PI*yaricap*yaricap;
    double daireCap = 2*yaricap;

//Girilen yaricapa göre kure ile ilgili hesaplamalar
//Math.pow kullanarak
    double kureHacim =(4.0/3.0) * PI * Math.pow(yaricap,3);
    double kureYuzeyAlan = 4* PI * Math.pow(yaricap,2);

System.out.println("==>*****SONUCLAR*****<==");


System.out.printf("Dairenin Cevresi : %.2f cm%n ",daireCevre);
System.out.printf("Dairenin Alani : %.2f cm^2%n ",daireAlan);
System.out.printf("Dairenin Yaricapi : %.2f cm%n ",daireCap);
System.out.printf("Kurenin Hacmi : %.2f cm^3%n",kureHacim);
System.out.printf("Kurenin Yuzey Alani : %.2f cm^2%n",kureYuzeyAlan);


    input.close();


    }
}

