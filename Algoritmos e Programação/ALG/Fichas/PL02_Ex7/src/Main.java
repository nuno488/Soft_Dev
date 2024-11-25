import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double percImpostos = 0.45;
        double percRevendedor = 0.28;

        System.out.print("Qual a marca: ");
        String marca = in.nextLine();
        System.out.println("Qual o preco de fábrica do " + marca + "?");
        double precoFabrica = in.nextDouble();

        double impostos = precoFabrica*percImpostos;
        double revendedor = precoFabrica*percRevendedor;
        double precoTotal = precoFabrica + impostos + revendedor;

        System.out.println("O carro de marca " + marca + " tem como valor final: " + precoTotal);
    }
}