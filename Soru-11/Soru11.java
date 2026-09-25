import java.util.Scanner;

public class Soru11 {
    public static void main(String[] args){
        final double MIL_TO_KM = 1.609;
        double milYol, kmYol;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Mil cinsinden arabanin gittigi yolu giriniz: ");
        milYol = scanner.nextDouble();

        kmYol = milYol * MIL_TO_KM;

        System.out.println("Araba " + kmYol + " km yol almistir.");
        
        scanner.close();

    }
}
