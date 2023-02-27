import java.util.Scanner;

public class q11 {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);

    double conta1 = 100;
    double conta2 = 100;
    
    System.out.println("Digite quanto deseja transferir: ");
    double transferencia = input.nextDouble();

    if(transferencia > conta1){
        System.out.println("Valor excede o saldo em conta");

    }else{
        conta1 = conta1 - transferencia;
        conta2 = conta2 + transferencia;

    }

    System.out.println("---Valor nas conta---");
    System.out.println("Valor na conta 01: " + conta1);
    System.out.println("Valor na conta 02: " + conta2);
    
    input.close();
    }

}
