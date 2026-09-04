import java.util.Scanner;

public class soru03 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int sayi1,sayi2;

        System.out.println("Lutfen 2 adet sayi giriniz: ");

        sayi1 = scanner.nextInt();
        sayi2 = scanner.nextInt();
        
        int carpim = sayi1 *sayi2;
        System.out.println("Carpim sonucu: " + carpim);

        scanner.close();
    }
}
