import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o valor em bytes a ser convertido para bits: ");
        int bytes = in.nextInt();

        int bits = bytes * 8;
        System.out.println("O valor em bits corresponde a " + bits);
    }
}