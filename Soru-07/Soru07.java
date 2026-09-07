import java.util.Scanner;

public class Soru07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a,b,c,x,sonuc;

        System.out.print("a,b,c,x degerlerini giriniz: ");

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        x = scanner.nextInt();

        sonuc = a*x*x + b*x + c;

        System.out.println("Sonuç: " + sonuc);
        
        scanner.close();
    }
}
