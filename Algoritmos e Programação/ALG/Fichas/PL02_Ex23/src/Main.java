import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, rep, maior, res = 0;

        System.out.println("Insira o 1º valor: ");
        a = in.nextInt();
        System.out.println("Insira o 2º valor: ");
        b = in.nextInt();

        if(a < b){
          rep = a;
          maior = b;
        }else{
            rep = b;
            maior = a;
        }

        for(int i=0; i<rep;  i++){
            res += maior;
        }
        System.out.printf("%d * %d = %d",a,b,res);
    }
}