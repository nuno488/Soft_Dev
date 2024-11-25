import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cont = 0;
        double total = 0;

        while(cont < 2){

            System.out.printf("Insira %dº valor: ", (cont+1));
            double valor = in.nextDouble();
            total += valor;
            cont++;
        }

        double media = total / cont;
        System.out.println("A media é: " + media);
    }
}