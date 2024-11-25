import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int anos = 0, semanas = 0, dias = 0;

        System.out.println("Insira o valor em dias a ser convertido: ");
        int valDias = in.nextInt();

        anos = valDias/365;

        if(anos%2 != 0){
            semanas = (valDias - 365) / 7;
        }

        if(semanas%7 != 0){
            dias = (valDias - 365) - (7 * semanas);
        }

        System.out.println(valDias + " dias correspondem a " + anos + " ano(s), " + semanas + " semana(s) e " + dias + " dia(s)");
    }
}