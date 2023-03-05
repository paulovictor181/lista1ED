import java.util.Scanner;

public class q19 {

    public static void main(String[] args) throws Exception{
        
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o número na qual você deseja ver a tabuada: ");
        int numero = input.nextInt();
        System.out.println();

        for(int i = 0; i <= 9; i++){

            System.out.println(i + " * " + numero + " = " + i * numero );

        }

        input.close();
    }
    
    
}
