import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int limiteInf = 1;
        int limiteSup = 51;
        int nrTentativas = 0;
        int nrLido;
        Random rnd = new Random();
       int nrAleatorio = rnd.nextInt(limiteInf,limiteSup);

       do{
           System.out.println("Insira um numero entre 1 e 50.");
           nrLido = in.nextInt();

           //validação
           if(nrLido < limiteInf || nrLido > limiteSup){
               System.out.println("O numero inserido não está entre 1 e 50.");
           }else{
               nrTentativas++;
               //verificar se o nr inserido é maior menor ou =
               if(nrLido > nrAleatorio){
                   System.out.println("Tente um numero menor.");
               } else if (nrLido < nrAleatorio) {
                   System.out.println("Tente um numero maior.");
               }else{
                   System.out.println("Acertou!!!");
                   System.out.println(nrTentativas + " tentativas utilizadas.");
               }
           }

       }while(nrLido != nrAleatorio);
    }
}