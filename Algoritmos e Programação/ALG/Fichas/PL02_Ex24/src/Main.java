import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double soma = 0;
        int cont = 0;
        double maior = 0, menor = 0;

        System.out.println("Quantos valores pertende introduzir: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Insira o %dº valor: ", i + 1);
            double val = in.nextDouble();

            soma += val;

            if (val > maior) {
                maior = val;
            }
            if (val < menor || menor == 0) {
                menor = val;
            }

        }

        double media = soma / n;
        System.out.println("A média é " + media);
        System.out.println("maior: " + maior + " menor: " + menor);
    }
}