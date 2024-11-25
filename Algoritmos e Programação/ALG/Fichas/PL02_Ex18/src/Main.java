import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1, cont = 0;
        double soma = 0;

        while (num != 0) {
            System.out.println("Insira um valor. Para parar insira 0: ");
            num = in.nextInt();
                if (num > 4) {
                    soma += num;
                    cont++;
                }
        }
        if(cont > 0){
            double media = soma / cont;
            System.out.println("A media é: " + media);
        }else{
            System.out.println("Nao inseriu valores superiores a 4");
        }

    }
}