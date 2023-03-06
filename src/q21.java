import java.util.Scanner;

public class q21 {

    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite um número para saber se ele é primo: ");
        int numero = input.nextInt();

        int contador = 0;

        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                contador++;
            }
        }

        if(contador == 2){
            System.out.println("O número é primo");
        }else{
            System.out.println("O número não é primo");
        }

        input.close();
    }
    
}
