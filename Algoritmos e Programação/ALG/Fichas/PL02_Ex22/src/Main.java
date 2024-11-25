import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o valor em MB para converter em Bytes: ");
        int bytes = in.nextInt();

        double MB = bytes * Math.pow(10,6);

        System.out.println("O valor em bytes corresponde a. " + MB);
    }
}