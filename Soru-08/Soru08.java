import java.util.Scanner;

public class Soru08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a,b,h;
        int taban_alanı,yanal_alan,toplam_alan,hacim;
        System.out.print("a,b,h degerlerini giriniz: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        h = scanner.nextInt();

        taban_alanı = a*b;
        yanal_alan =  2 * a * h + 2 * b * h;
        toplam_alan = yanal_alan +2*taban_alanı;
        hacim = a * b * h;
        System.out.println("Taban Alani: " + taban_alanı);
        System.out.println("Yanal Alani: " + yanal_alan);
        System.out.println("Toplam Alani: " + toplam_alan);
        System.out.println("Hacim: " + hacim);
        scanner.close();

    }
    
}
