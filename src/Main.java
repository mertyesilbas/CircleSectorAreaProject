import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        // Create Variables
        double pi = 3.14, radius, angle, result;

        // Create Scanner
        Scanner scanner = new Scanner(System.in);

        // Take Input
        System.out.println("Daire Dilimi Alan Hesaplama \n" + "Yarıçapı Giriniz: ");
        radius = scanner.nextDouble();
        System.out.println("Açıyı Giriniz: ");
        angle = scanner.nextDouble();

        // Calculations
        result = (pi * (radius * radius) * angle) / 360;
        System.out.println("Dilimin Alanı: " + df.format(result));
    }
}