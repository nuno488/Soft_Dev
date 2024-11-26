import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // variavel global in
    static Scanner in = new Scanner(System.in);
    //variavel global saldo
    static int saldo = 100;
    //varivel global nome
    static String nome;

    public static void main(String[] args) {
        System.out.println("---JOGOS DE SORTE OU AZAR---");
        System.out.println("Insira o seu nome: ");
        nome = in .nextLine();
        System.out.println("Bem vindo " + nome);
        //Menu
        int op = -1;
        do{
            System.out.println("---JOGOS DE SORTE OU AZAR---");
            System.out.println("Selecione uma opção:");
            System.out.println("1-Lotaria");
            System.out.println("2-Raspadinha");
            System.out.println("3-Ver Saldo");
            System.out.println("4-Levantar dinheiro.");
            System.out.println("0-Sair");

            // Validação para o caso de não ser um nr. EX.
            try {
                op = in.nextInt();
            }catch (Exception e){
                System.out.println("Valor inválido");
                // quando ele lê uma String no nextInt() temos de
                // voltar a criar um novo objeto Scanner (in)
                in = new Scanner(System.in);
            }

            if(op == 0){
                break;
            }else if(op == 1){
                Lotaria();
            } else if (op == 2) {
                Raspadinha();
            }else if (op == 3) {
                System.out.println(nome + " o seu saldo é " + saldo + " euros.");
            } else if (op == 4) {
                Levantar();
            } else {
                System.out.println("Opção inválida");
            }
        }while(op!=0);

    }

    //levantar dinheiro
    private static void Levantar() {
        int levantamento;
        do{
            System.out.println("Quanto pretende levantar " + nome);
            levantamento = in.nextInt();
            if(levantamento > saldo){
                System.out.println("Não tem saldo suficiente para a quantia a ser levantada.");
                System.out.println("O seu saldo: " + saldo + " euros.");
            }else{
                saldo -= levantamento;
                System.out.println(nome + " tem agora " + saldo + " euros.");
            }
        }while(levantamento > saldo);


    }

    //metodo Lotaria
    private static void Lotaria() {
        int limiteInf = 1000;
        int limiteSup = 10000;
        int nr;
        saldo -= 5;
        do{
            System.out.println("Selecione um valor entre 1000 e 9999: ");
            nr = in.nextInt();
            if(nr < 1000 || nr > 9999 ){
                System.out.println("Numero inválido.");
            }
        }while(nr < 1000 || nr > 9999);



        int nrSorteado = Aleatorio(limiteInf, limiteSup);
        // verificação do premio
        if (nrSorteado == nr) {
            System.out.println("Parabéns ganhou o 1º prémio");
            saldo += 1000;
        } else if (nrSorteado % 1000 == nr % 1000) {
            System.out.println("Ganhou o 2º prémio");
            saldo += 100;
        } else if (nrSorteado % 100 == nr % 100) {
            System.out.println("Ganhou o 3º prémio");
            saldo += 10;
        } else {
            System.out.println("Infelizmente não ganhou nada. Melhor sorte para a próxima");
        }


    }

    // gerar valores aleatorios para os sorteios
    private static int Aleatorio(int limiteInf, int limiteSup) {
        Random rnd = new Random();
        return rnd.nextInt(limiteInf,limiteSup);
    }

    //Submenu Raspadinha
    private static void Raspadinha() {
        int op;
        do{
            System.out.println("---RASPADINHA---");
            System.out.println("Selecione uma opção:");
            System.out.println("1-Raspadinha A");
            System.out.println("2-Raspadinha B");
            System.out.println("0-Voltar ao menu anterior");
            op=in.nextInt();

            if(op == 0){
                break;
            }else if(op == 1){
                RaspadinhaA();
            } else if (op == 2) {
                RaspadinhaB();
            } else {
                System.out.println("Opção inválida");
            }

        }while(op!=0);
    }

    private static void RaspadinhaB() {
        int limiteInf = 1;
        int limiteSup = 11;
        int nrPrincipal = Aleatorio(limiteInf, limiteSup);
        int premioSort = Aleatorio(limiteInf, limiteSup);
        int cont = 0;
        int nrSort;
        int nr;
        saldo -= 2;

        //validação do valor introduzido
        do{
            System.out.println("RASPADINHA B");
            System.out.println("Selecione um numero entre 1 e 10:");
            nr = in.nextInt();
            if(nr < 1 || nr > 10){
                System.out.println("Numero inválido.");
            }
        }while(nr < 1 || nr > 10);

        //gerar 9 nrs e verificar premios
        for(int i = 0; i < 10; i++){
            nrSort = Aleatorio(limiteInf, limiteSup);
            if(nrSort == nrPrincipal) {
                cont++;
            }
        }
        //verificar premios
        if(cont == 3){
            System.out.println("Ganhou " + premioSort + " euros.");
            saldo += premioSort;
        }else{
            System.out.println("Não ganhou prémio.");
        }
    }

    private static void RaspadinhaA() {
        int nrPrincipal = 3;
        int nr;
        int limiteInf = 1;
        int limiteSup = 11;
        int totalPremios = 0;
        saldo -= 2;

        //validação do valor introduzido
        do{
            System.out.println("RASPADINHA A");
            System.out.println("Selecione um numero entre 1 e 10:");
            nr = in.nextInt();
            if(nr < 1 || nr > 10){
                System.out.println("Numero inválido.");
            }
        }while(nr < 1 || nr > 10);


        // gerar 5 nrs aleatorios
        for(int i = 0; i < 5; i++){
            int nrSorteado = Aleatorio(limiteInf, limiteSup);
            int premio = Aleatorio(1, 101);
            // verificação de premior
            if(nrSorteado == nrPrincipal){
                totalPremios += premio;
            }
        }
        //Quanto ganhou?
        if(totalPremios > 0){
            System.out.println("Ganhou " + totalPremios + " euros");
            saldo += totalPremios;
        }else{
            System.out.println("Não ganhou prémio nenhum. Melhor sorte para a proxima.");
        }
    }


}