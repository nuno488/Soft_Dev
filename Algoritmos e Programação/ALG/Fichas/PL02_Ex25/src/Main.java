import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o ano: ");
        int ano = in.nextInt();

        if(ano%4 == 0 && ano%100 !=0){
            System.out.println("bissexto");
        }else if(ano%4 == 0 && ano%100 == 0 && ano%400 != 0){
            System.out.println("não é bissexto");
        }else if(ano%4 == 0 && ano%100 ==0 && ano%400 == 0){
            System.out.println("bissexto");
        }

    }
}