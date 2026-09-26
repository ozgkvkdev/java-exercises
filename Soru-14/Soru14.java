import java.util.Scanner;

public class Soru14 {
    public static void main(String[] args){
        int a, b, gecici;
        Scanner input = new Scanner(System.in);

        System.out.print("A sayisini giriniz: ");
        a = input.nextInt();

        System.out.print("B sayisini giriniz: ");
        b = input.nextInt();

        System.out.println("Yerdegistirmeden once:");
        System.out.println("A sayisi: " + a);
        System.out.println("B sayisi: " + b);

        gecici = a;
        a = b;  
        b = gecici;

        System.out.println("Yerdegistirmeden sonra:");
        System.out.println("A sayisi: " + a);
        System.out.println("B sayisi: " + b);
        input.close();

    }
}
