import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double soma = 0;
        int i = 0;

        for(; i<20; i++){
            System.out.printf("Insira o %dº valor: ", i+1);
            double val = in.nextDouble();
            soma += val;
        }
        double media = soma/i;
        System.out.println("A media dos valores é: " + media);
    }
}