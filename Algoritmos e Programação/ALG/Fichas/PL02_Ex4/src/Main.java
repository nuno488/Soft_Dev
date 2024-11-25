import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ler base e altura de um triangulo, calcular a área
        Scanner in = new Scanner(System.in);
        double base, altura;

        System.out.print("Qual a base do triangulo: ");
        base = in.nextDouble();
        System.out.print("Qual a altura do triangulo: ");
        altura = in.nextDouble();
        System.out.println("A area do triangulo é: " + base*altura/2);

    }
}