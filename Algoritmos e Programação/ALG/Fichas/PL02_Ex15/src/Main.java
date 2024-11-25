import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double soma = 0;
        int i;

        for(i = 0; i < 2; i++){
           System.out.printf("Insira o %dº valor: ", i+1);
           double valor = in.nextDouble();
           soma += valor;
        }

        System.out.println("A media é " + soma/i);
    }
}