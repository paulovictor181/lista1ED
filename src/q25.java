import java.util.Scanner;

public class q25 {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Defina o tamanho do vetor: ");
        int i = input.nextInt();

        int[] numerosInteiros = new int[i];

        for(int j = 0 ; j < i; j++){
            System.out.printf("Digite o elemento [" + j + "]:");
            numerosInteiros[j] = input.nextInt();
        }

        for(int j = 0 ; j < i; j++){
            System.out.print(numerosInteiros[j] + " ");
        }

        System.out.println();

        input.close();
    }
}
