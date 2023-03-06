import java.util.Scanner;

public class q26 {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Defina a quantidade de linhas da Matriz: ");
        int linhas = input.nextInt();

        System.out.printf("Defina a quantidade de colunas da Matriz: ");
        int colunas = input.nextInt();

        System.out.println();

        int[][] numerosInteiros = new int[linhas][colunas];

        for(int i = 0 ; i < numerosInteiros.length; i++){
            for(int j = 0 ; j < numerosInteiros[i].length; j++){
                System.out.printf("Digite o elemento [" + i + "][" + j + "]:");
                numerosInteiros[i][j] = input.nextInt();
            }
        }

        System.out.println();

        for(int i = 0 ; i < numerosInteiros.length; i++){
            for(int j = 0 ; j < numerosInteiros[i].length; j++){
                System.out.print(numerosInteiros[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
