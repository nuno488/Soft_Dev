import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //---------variaveis globais---------------//
    static Scanner in = new Scanner(System.in);
    static int limiteInf = 1;
    static int limiteSup = 21;
    static int nrTentativas = 0;
    static int nrLido;
    static Random rnd = new Random();
    static int nrAleatorio = rnd.nextInt(limiteInf,limiteSup);
    //----------------------------------------//
    public static void main(String[] args) {
        int op;

        do{
            System.out.println("JOGO - ADVINHE O NUMERO");
            System.out.println("Selecione o nivel de dificuldade: ");
            System.out.println("1-Nivel Básico");
            System.out.println("2-Nivel Intermédio");
            System.out.println("3-Nivel Avançado");
            System.out.println("0-Sair");
            op = in.nextInt();

            //validação da opcao
            if(op < 0 || op > 3){
                System.out.println("Opção inválida.");
            }

            //chamar metodos apos selecao do nivel
            switch (op){
                case 1:
                    Basico();
                    break;
                case 2:
                    Intermedio();
                    break;
                case 3:
                    Avancado();
                    break;
            }

        }while(op != 0);
    }// end metodo main

    //metodo para o nivel avançado
    private static void Avancado() {
        boolean certo = false;
        do{
            System.out.println("nr certo: " + nrAleatorio);
            System.out.println("Insira um numero entre 1 e 20.");
            nrLido = in.nextInt();
            int dif = Math.abs(nrAleatorio-nrLido);


            //validação
            if(nrLido < limiteInf || nrLido > limiteSup){
                System.out.println("O numero inserido não está entre 1 e 20.");
            }else{
                nrTentativas++;
                //verificar se o nr inserido é maior menor ou =
                if(dif == 2 ){
                    System.out.println("O numero inserido está perto");
                } else if (dif > 2 && dif < 5) {
                    System.out.println("O numero inserido está nem perto nem longe.");
                } else if (dif > 5) {
                    System.out.println("O numero inserido está longe.");
                } else{
                    System.out.println("Acertou!!!");
                    System.out.println(nrTentativas + " tentativas utilizadas.");
                    certo = true;
                }
            }

        }while(nrLido != nrAleatorio || !certo);
    }

    //metodo para o nivel intermedio
    private static void Intermedio() {
        int nrTentativas = 3;
        int cont = 0;

        do{
            System.out.println("Insira um numero entre 1 e 20. Tem " + nrTentativas + " tentativas.");
            nrLido = in.nextInt();

            //validação
            if(nrLido < limiteInf || nrLido > limiteSup){
                System.out.println("O numero inserido não está entre 1 e 20.");
            }else{
                nrTentativas--;
                cont++;
                //verificar se o nr inserido é maior menor ou =
                // e se tentativas <= 3
                if(nrTentativas > 0){
                    if(nrLido > nrAleatorio){
                        System.out.println("Tente um numero menor.");
                    } else if (nrLido < nrAleatorio) {
                        System.out.println("Tente um numero maior.");
                    }else{
                        System.out.println("Acertou!!!");
                        System.out.println(cont + " tentativas utilizadas.");
                    }
                }else{
                    System.out.println("Esgotou as tentativas.");
                }
            }

        }while((nrLido != nrAleatorio) && nrTentativas > 0);
    }

    //metodo para o nivel basico
    private static void Basico() {
        do{
            System.out.println("Insira um numero entre 1 e 20.");
            nrLido = in.nextInt();

            //validação
            if(nrLido < limiteInf || nrLido > limiteSup){
                System.out.println("O numero inserido não está entre 1 e 20.");
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


}// end class Main