import java.util.Scanner;

public class q24 {

    public static int Fatorial(int n1){
        
        int fatorial = 1;
        
        while(n1 > 1){
            
            fatorial =  n1 * fatorial ;
            n1--;
        }

        return fatorial;
    }

    public static void main (String[] args)throws Exception{
        
        Scanner input = new Scanner(System.in);

        int i = 0;

        do{
    
        System.out.println("******************MENU*******************");
        System.out.println("1 - potenciação");
        System.out.println("2 - raiz quadrada");
        System.out.println("3 - fatorial");
        System.out.println("0 - sair");
        System.out.printf("Escolha uma opção: ");
        int resposta = input.nextInt();

        switch(resposta){
            case 0:
                i++;
                break;
            case 1:
                System.out.printf("Digite o número para a base da potencia: ");
                int numeroBasePotencia = input.nextInt();

                System.out.printf("Digite o número para o expoente da potencia: ");
                int numeroBaseExpoente = input.nextInt();

                System.out.printf("Resultado: " + Math.pow(numeroBasePotencia, numeroBaseExpoente));

                System.out.println();
                break;
            case 2:
                System.out.printf("Digite o número para fazer a raiz quadrada: ");
                int numeroRaiz = input.nextInt();

                System.out.printf("Resultado: " + Math.sqrt(numeroRaiz));

                System.out.println();
                break;
            case 3:
                System.out.printf("Digite o número para saber o fatorial: ");
                int numeroFactorial = input.nextInt();

                System.out.printf("Resultado: " + Fatorial(numeroFactorial));

                System.out.println();
                break;
            default:
                System.out.println("Valor invalido!");

                System.out.println();
                break;
        }

        }while(i != 1);
    
        input.close();
     
        }
        
}
