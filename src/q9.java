import java.util.Scanner;
import java.lang.Math;

public class q9 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do Raio: ");
        double raio = input.nextDouble();

        if(raio < 0){
            System.out.println("Raio Negativo, Valor invalido!!!!");

        }else{
            double area = Math.PI * (raio * raio);
            System.out.printf("Area da Circunferencia: %.2f \n" , area);

        }

        input.close();
    }
}
