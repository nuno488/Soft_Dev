import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double soma = 0;
        double cont = 0;
        double numero;
        int continuar;

        do{
            System.out.println("Insira um numero. Insira 0 para parar");
            numero = in.nextDouble();

            if (numero>4){
                soma += numero;
                cont++;
            }
            System.out.println("Pretende inserir novo numero?\n1-Sim\n2-Não");
            continuar = in.nextInt();
        }while(numero != 0);

        if(cont > 0){
            double media = soma/cont;
            System.out.println("A média é " + media);
        }else{
            System.out.println("não inseriu valores superiores a 4.");
        }
    }
}