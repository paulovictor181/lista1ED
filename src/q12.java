import java.util.Scanner;

public class q12 {
    public static void main (String[] args) throws Exception{

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da Nota 01: ");
        double nota1 = input.nextDouble(); 
        System.out.print("Digite o valor da Nota 02: ");
        double nota2 = input.nextDouble();
        System.out.print("Digite o valor da Nota 03: ");
        double nota3 = input.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;

        if(media >= 7){
            System.out.println("Parabens, você está aprovado com media: " + media);

        }else if(media < 7 & media > 3.5 ){
            
            System.out.println("Você está de quarta prova");

            System.out.print("Digite o valor da quarta prova: ");
            double nota4 = input.nextDouble();

            double mediaFinal = ((media * 6) + (nota4 * 4))/10;

            if(mediaFinal >= 5){
                System.out.println("Parabens, você está aprovado com media: " + mediaFinal);
            }else{
                System.out.println("Uma pena, você está reprovado com media: " + mediaFinal);
            }

        }else{
            System.out.println("Uma pena, você está reprovado com media: " + media);
        }

        input.close();

    }
}
