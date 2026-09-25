import java.util.Scanner;

public class Soru09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float x , sonuc;
        System.out.print("lütfen bir sayı girin: ");
        x = input.nextFloat();
        sonuc = x * x * x +13 *x *x +47 * x + 5;
        System.out.println("Sonuc: " + sonuc);
        input.close();
        
    }
}
