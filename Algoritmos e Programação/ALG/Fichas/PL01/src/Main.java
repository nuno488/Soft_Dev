import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Programa que pede o nome do utilizador e o cumprimenta
        System.out.println("Qual o seu nome?");
        /*String nome = in.nextLine();
        System.out.println("Olá " + nome + "!");*/

        System.out.println("Olá " + in.nextLine());
    }
}