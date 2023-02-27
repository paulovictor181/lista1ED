import java.util.Scanner;

public class q6 {

    final static double precoRefrigerante = 1.50;
    final static double precoFatia = 3.00;
    final static double taxaDoGarcom = 1.10;
    
    private static double calcularConta(double qtdRefrigerante, double fatiasPizza){
        return precoRefrigerante * qtdRefrigerante + precoFatia * fatiasPizza;
    }

    private static double calcularContaTaxa(double qtdRefrigerante, double fatiasPizza){
        return (precoRefrigerante * qtdRefrigerante + precoFatia * fatiasPizza) * taxaDoGarcom;
    }

    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos refrigerantes deseja comprar: ");
        int refri = input.nextInt();
        System.out.print("Quantas fatias deseja comprar: ");
        int fatias = input.nextInt();
        System.out.print("Quantidade de pessoas na mesa: ");
        int qtdPessoas = input.nextInt();


        double Conta = calcularConta(refri, fatias);
        System.out.printf("Conta: %.2f \n" , Conta );

        double ContaTaxa = calcularContaTaxa(refri, fatias);
        System.out.printf("Conta: %.2f \n" , ContaTaxa );

        double valorPorPessoa = calcularContaTaxa(refri, fatias) / qtdPessoas;
        System.out.printf("Valor por pessoa: %.2f \n" , valorPorPessoa);


        input.close();

    }
}
