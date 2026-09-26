import java.util.Scanner;

public class Soru15 {
    public static void main(String[] args) {
       final double yol = 450;

       double saat, ortalamaHiz;

       Scanner scanner = new Scanner(System.in);

       System.out.print("Ankara - Istanbul arasini kac saatte gittiniz: ");
       saat = scanner.nextDouble();

       ortalamaHiz = yol / saat;
       System.out.println("Ortalama hiz: " + ortalamaHiz);
       scanner.close();
    }
}
