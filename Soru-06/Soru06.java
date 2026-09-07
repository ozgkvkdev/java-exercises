import java.util.Scanner;

public class Soru06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double fah,cen;
        System.out.print("Fahrenheit degerini giriniz: ");
        fah = scanner.nextDouble();
        cen = (fah - 32) * 5/9;
        System.out.println("Santigrat degeri: " + cen);
        scanner.close();

    }
    
}
