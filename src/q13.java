import java.util.Scanner;

public class q13 {
    public static void main (String[] args) throws Exception{

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da Nota 01: ");
        double nota1 = input.nextDouble(); 
        System.out.print("Digite o valor da Nota 02: ");
        double nota2 = input.nextDouble();
        System.out.print("Digite o valor da Nota 03: ");
        double nota3 = input.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;

        if(media >= 7)
        {
            System.out.printf("Parabens, você está aprovado com media: %.2f \n" , media);

        }
        else if(media < 7 & media > 3.5 )
        {
            
            System.out.println("Você está de Recuperação");

            System.out.printf("Você precisa de %.2f \n" , (50 - (media * 6)) / 4 ); 

            System.out.print("Digite o valor da Recuperação: ");
            double nota4 = input.nextDouble();

            double mediaFinal = ((media * 6) + (nota4 * 4))/10;

            if(mediaFinal >= 5)
            {
                System.out.printf("Parabens, você está aprovado com media: %.2f \n" , mediaFinal);
            }
            else
            {
                System.out.printf("Uma pena, você está reprovado com media: %.2f \n" , mediaFinal);
            }

        }
        else
        {
            System.out.printf("Uma pena, você está reprovado com media: %.2f \n" , media);
        }

        input.close();
    }
}
