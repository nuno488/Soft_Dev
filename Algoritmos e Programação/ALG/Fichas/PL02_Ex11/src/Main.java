import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insira o lado A do triangulo: ");
        double a = in.nextDouble();
        System.out.print("Insira o lado B do triangulo: ");
        double b = in.nextDouble();
        System.out.print("Insira o lado C do triangulo: ");
        double c = in.nextDouble();

        /*if((a <= 0 || b <= 0 || c <=0) || (a > b+c || b > a+c || c > a+b)){
            System.out.println("Os lados não formam um triangulo");
        }else{
            if(a == b && a == c){
                System.out.println("Equilatero");
            }else if(a != b && a != c && b != c){
                System.out.println("Escaleno");
            }else if(a == b || a == c || b == c){
                System.out.println("Isosceles");
            }
        }*/

        if((a <= 0 || b <= 0 || c <=0)){
            System.out.println("Trinagulo invalido, pelo menos um dos lados é 0 ou negativo");
        }else if((a > b+c || b > a+c || c > a+b)){
            System.out.println("Trinagulo invalido, pelo menos um dos lados é maior do que  a soma dos outros 2");
        }else{
            if(a == b && a == c){
                System.out.println("Equilatero");
            }else if(a != b && a != c && b != c){
                System.out.println("Escaleno");
            }else if(a == b || a == c || b == c){
                System.out.println("Isosceles");
        }

    }
}