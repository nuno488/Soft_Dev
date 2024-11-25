import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        int numero = in.nextInt();

        if(numero % 2 !=0){
            System.out.println("O numero é impar");
        }else{
            System.out.println("O numero não é impar");
        }
    }
}