import java.util.Scanner;

public class q3 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = input.nextDouble();

        double soma = n1 + n2;
        double sub = n1 - n2;
        double multi = n1 * n2;
        double divisao = n1 / n2;
        double resto = n1 % n2;
        
        
        System.out.println("Soma: " + soma + " | Subtração: " + sub + " | Multiplicação: " + multi + " | Divisão: " + divisao + " | resto: " + resto);

        input.close();
    }
}
