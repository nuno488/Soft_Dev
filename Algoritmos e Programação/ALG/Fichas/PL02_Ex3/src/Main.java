import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ler 2 nums inteiros e apresenta a sua dif
        Scanner in = new Scanner(System.in);

        int n1, n2;

        System.out.print("Introduza o primeiro valor: ");
        n1 = in.nextInt();
        System.out.print("Introduza o segundo valor: ");
        n2 = in.nextInt();
        System.out.printf("A diferença entre " + "%d" + " e " + "%d é: %d", n1, n2, n1-n2);
    }
}