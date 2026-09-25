import java.util.Scanner;

public class Soru10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int kenar, alan;

        System.out.print("Kenar uzunlugunu giriniz: ");
        kenar = input.nextInt();

        alan = kenar * kenar;

        System.out.println("Karenin alani = " + alan);
        input.close();
        
    }
}
