import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o ano: ");
        int ano = in.nextInt();

        if((ano%400 == 0) || (ano%4 == 0 && ano%100 !=0)) {
            System.out.println("O ano " + ano +" é bissexto");
        }else{
            System.out.println("O ano " + ano +" não é bissexto");
        }

    }
}