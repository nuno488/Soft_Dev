import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o codigo do produto: ");
        int codigo = in.nextInt();

        switch (codigo){
            case 1:
                System.out.println("Parafuso");
                break;
            case  2:
                System.out.println("Porca");
                break;
            case 3:
                System.out.println("Prego");
                break;
            default:
                System.out.println("Não definido");
        }
    }
}