import java.util.Scanner;

public class Soru13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double en, boy, yukseklik, metrekup;
        System.out.println("Havuzun enini,boyunu ve yuksekligini giriniz: ");
        en = scanner.nextDouble();
        boy = scanner.nextDouble();
        yukseklik = scanner.nextDouble();

        metrekup = en * boy * yukseklik;
        System.out.println("Havuzun metrekup degeri: " + metrekup);

        scanner.close();
    }
}
