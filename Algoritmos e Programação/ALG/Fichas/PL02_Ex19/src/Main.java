import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira um valor em horas para ser convertido para segundos: ");
        double valHrs = in.nextDouble();
        double valSeg = valHrs*60*60;
        System.out.printf("%.2f horas são %.2f segundos", valHrs, valSeg);
    }
}