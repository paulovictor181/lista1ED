import java.util.Scanner;

public class q20 {

    public static void main(String[] args) throws Exception{
        
        Scanner input = new Scanner(System.in);

        System.out.println("Simulador de Poupança");

        System.out.printf("Digite o seu investimento inicial na poupança: ");
        double investimentoIncial = input.nextDouble();
        System.out.println("Digite o seu investimento mensal: ");
        double investimentoMensal = input.nextDouble();
        System.out.println("Digite o tempo de deseja investir(Meses): ");
        int qtdMeses = input.nextInt();
        
        double taxaDeJuros = 0.005;

        double redimentoMensal = 0;

        double saldoAcumulado = investimentoIncial;

        for(int i = 1; i <= qtdMeses; i++){

            redimentoMensal = saldoAcumulado * taxaDeJuros;
            System.out.println("Rendimento no Mês " + i + ": " + redimentoMensal);
            saldoAcumulado = saldoAcumulado + investimentoMensal + redimentoMensal;
            System.out.println("Saldo no Mês " + i + ": " + saldoAcumulado);
            
        }

        input.close();
    }
}
