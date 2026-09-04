import java.util.Scanner;

public class Soru04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int bolunen, bolen, bolum, kalan;
        
        System.out.print("Lutfen bolunen sayiyi giriniz: ");
        bolunen = scanner.nextInt();
        System.out.print("Lutfen bolen sayiyi giriniz: ");
        bolen = scanner.nextInt();

        bolum = bolunen / bolen;
        kalan = bolunen % bolen;

        System.out.println("Bolum: " + bolum);
        System.out.println("Kalan: " + kalan);

        scanner.close();
    }
}
