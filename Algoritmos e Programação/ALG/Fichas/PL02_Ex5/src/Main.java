import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //valor pago, preço, troco
        Scanner in = new Scanner(System.in);

        double preco, valorPago, troco;
        preco = 23.50;


        System.out.print("O preço do produto: " + preco + "\n" + "Pagamento: ");
        valorPago = in.nextDouble();
        troco = valorPago - preco;

        if(troco > 0){
            System.out.println("O seu troco: " + troco);
        } else if(troco < 0){
            System.out.println("Ainda falta pagar: " + Math.abs(troco));
        } else{
            System.out.println("Nao tem troco" );
        }




    }
}