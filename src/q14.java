import java.util.Scanner;
import java.lang.Math;

public class q14 {

    private static double calcularDelta(double ValorA, double ValorB, double ValorC ){
        double delta = Math.pow(ValorB, 2) - 4 * ValorA * ValorC;

        return delta;
    }

    private static void calcularRaizes(double ValorA, double ValorB, double Delta){
        double raiz1 = (- ValorB + Math.sqrt(Delta)) / ( 2 * ValorA );
        double raiz2 = (- ValorB - Math.sqrt(Delta)) / ( 2 * ValorA );
        System.out.printf("Raiz 1: %f \n" , raiz1);
        System.out.printf("Raiz 2: %f \n" , raiz2);
    }
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Função de 2º Grau: ax² + bx + c ");
        System.out.print("Fonceça o valor de 'a': ");
        double valorA = input.nextDouble();
        System.out.print("Fonceça o valor de 'b': ");
        double valorB = input.nextDouble();
        System.out.print("Fonceça o valor de 'c': ");
        double valorC = input.nextDouble();

        double delta = calcularDelta(valorA, valorB, valorC);

        
        if(valorA == 0){
            System.out.println("Não é uma equação do segundo grau");
        }
        else if(delta < 0)
        {
            System.out.println("Equação de segundo Grau não possui raizes reais");
        }
        else
        {
            calcularRaizes(valorA, valorB, delta);
        }

        input.close();
        
    }
}
