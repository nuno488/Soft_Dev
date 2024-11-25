import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //variavel global in
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do{
            System.out.println("Bem vindo!");
            System.out.println("Escolha uma das seguintes opções:");
            System.out.println("1-Calculadora");
            System.out.println("2-Lista de números");
            System.out.println("3-Calendário");
            System.out.println("0-Sair\n");
            opcao = in.nextInt();

            if(opcao == 0){
                break;
            }else if(opcao == 1){
                Calculadora();
            } else if (opcao == 2) {
                ListaNumeros();
            }else if(opcao == 3){
                Calendario();
            }else {
                System.out.println("Opção inválida");
            }

        }while(opcao !=0);
    }

    private static void Calendario() {
        int opcao;
        do{
            System.out.println("Aplicação 2: Calendário");
            System.out.println("1-Verificar se um ano é bissexto");
            System.out.println("2-Transformar um numero de dias em anos, semanas e dias.");
            System.out.println("0-Voltar ao menu anterior\n");
            opcao = in.nextInt();

            if(opcao == 0){
                break;
            }else if(opcao == 1){
                Bissexto();
            } else if (opcao == 2) {
                Transformar();
            }else {
                System.out.println("Opção inválida");
            }
        }while(opcao != 0);
    }

    private static void Transformar() {
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

    private static void Bissexto() {
        System.out.println("Insira o ano: ");
        int ano = in.nextInt();

        if((ano%400 == 0) || (ano%4 == 0 && ano%100 !=0)) {
            System.out.println("O ano " + ano +" é bissexto");
        }else{
            System.out.println("O ano " + ano +" não é bissexto");
        }
    }

    //metodo calculadora
    public static void Calculadora(){

        //submenu calculadora
        int opcao;

            do{
                System.out.println("Aplicação 1: Calculadora");
                System.out.println("1-Somar");
                System.out.println("2-Subtrair");
                System.out.println("3-Multiplicar");
                System.out.println("4-Dividir");
                System.out.println("0-Voltar ao menu anterior\n");
                opcao = in.nextInt();

                switch (opcao) {
                    case 0:
                        break;
                    case 1:
                        Somar();
                        break;
                    case 2:
                        Subtrair();
                        break;
                    case 3:
                        Multiplicar();
                        break;
                    case 4:
                        Dividir();
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            }while(opcao != 0);
    }

    private static void Dividir() {
        double res;

        System.out.println("Para somar insira dois valores");
        System.out.println("Primeiro valor: ");
        double n1 = in.nextDouble();
        System.out.println("Segundo valor: ");
        double n2 = in.nextDouble();
        res = n1 / n2;
        System.out.println("Resultado: " + n1 + " / " + n2 + " = " + res);
    }

    private static void Multiplicar() {
        double res;

        System.out.println("Para somar insira dois valores");
        System.out.println("Primeiro valor: ");
        double n1 = in.nextDouble();
        System.out.println("Segundo valor: ");
        double n2 = in.nextDouble();
        res = n1 * n2;
        System.out.println("Resultado: " + n1 + " * " + n2 + " = " + res);
    }

    //metodo ListaNumeros
    private static void ListaNumeros() {
        System.out.println("Insira o primeiro numero da lista:");
        int n1 = in.nextInt();
        System.out.println("Insira o primeiro numero da lista:");
        int n2 = in.nextInt();

        int aux;
        if(n1 > n2){
            aux = n2;
            n2 = n1;
            n1 = aux;
        }
        //imprimir lista de numeros
        for(int i = n1; i <= n2; i++){
            System.out.println(i);
        }
    }

    //metodo Somar()
    public static void Somar(){

        int res;

        System.out.println("Para somar insira dois valores");
        System.out.println("Primeiro valor: ");
        int n1 = in.nextInt();
        System.out.println("Segundo valor: ");
        int n2 = in.nextInt();
        res = n1 + n2;
        System.out.println("Resultado: " + n1 + " + " + n2 + " = " + res);
    }

    //metodo Subtrair()
    private static void Subtrair() {

        int res;

        System.out.println("Para somar insira dois valores");
        System.out.println("Primeiro valor: ");
        int n1 = in.nextInt();
        System.out.println("Segundo valor: ");
        int n2 = in.nextInt();
        res = n1 - n2;
        System.out.println("Resultado: " + n1 + " - " + n2 + " = " + res);
    }
}