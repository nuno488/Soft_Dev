import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o codigo do produto: ");
        String codigo = in.nextLine();

        if(codigo.equals("001")){
            System.out.println("Parafuso");
        }else if(codigo.equals("002")){
            System.out.println("Porca");
        }else if(codigo.equals("003")){
            System.out.println("Prego");
        }else{
            System.out.println("Não definido");
        }
    }
}