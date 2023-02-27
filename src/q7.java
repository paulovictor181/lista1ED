import java.util.Scanner;

public class q7 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = input.nextDouble();

        if(n2 == 0){
            System.out.println("Divisão por 0");

        }else{
            double divisao = n1 / n2;
            System.out.printf("Divisão: %.2f \n" , divisao);

        }

        input.close();
    }

}
