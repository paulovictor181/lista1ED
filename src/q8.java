import java.util.Scanner;

public class q8 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = input.nextDouble();

        System.out.print("Digite a sua altura: ");
        double altura = input.nextDouble();

        if(altura == 0){
            System.out.println("Divisão por 0, valor não valido");

        }else{
            double imc = peso / (altura * altura);
            System.out.printf("IMC: %.2f \n" , imc);

        }

        input.close();
    }
}
