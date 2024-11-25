import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual valor binário deseja converter em decimal?");
        int binary = in.nextInt();
        int decimal = 0;
        //int base = 1;
        for (int i = 0; binary > 0; i++) {
            decimal = decimal + (int) Math.pow(2, i) * (binary % 10);
            binary = binary / 10;
            /*int lastDigit = binary % 10;
            decimal += lastDigit * base;
            binary /= 10;
            base = base * 2;*/
        }
        System.out.println(decimal);
    }
}