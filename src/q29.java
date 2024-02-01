import java.util.Scanner;

public class q29 {
    public static int[] trocaPosicao(int[] array){
        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[i];
            array[i] = array[i - 1];
            array[i - 1] = temp;
        }

        return array;
    }
    public static void main(String[] args) throws Exception {
        
    	try (Scanner input = new Scanner(System.in)) {
            int n;
            int i;

            //Criaçao do vetor
            System.out.println("Digite a quantidade de casas que o vetor possui: ");
            n = input.nextInt();

            int vetor[] = new int[n];

            //Alocando valores nas casas do vetor
            for (i=0; i<n ; i++){

                System.out.println("Informe os valores do vetor na casa "+i);
                vetor[i] = input.nextInt();
                    
            }

            System.out.print("Vetor Inicial: ");
            for (i=0; i<n; i++){
                System.out.print(vetor[i]);
            }
            System.out.println();

            int[] array = trocaPosicao(vetor);

            System.out.print("Vetor Final: ");
            for (i = 0; i < n; i++){
                System.out.print(array[i]);
            }
        }
    }
}