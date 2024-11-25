import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //preco por kg
        Scanner in = new Scanner(System.in);
        double valor_kg, quantidade;

        System.out.print("Qual o valor por kg: ");
        valor_kg = in.nextDouble();
        System.out.print("Quantidade de kgs consumida: ");
        quantidade = in.nextDouble();
        System.out.println("O valor final a ser pago: " + valor_kg*quantidade);

    }
}