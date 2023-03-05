import java.util.Scanner;

public class q16 {


    public static void main (String[] args)throws Exception{
        
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o número incial da contagem: ");
    int n1 = input.nextInt();

    System.out.println("Digite o número final da contagem: ");
    int n2 = input.nextInt();

    int n1While = n1;
    int n1DoWhile = n1;

    int n2While = n2;
    int n2DoWhile = n2;

    while(n1While <= n2While){
        System.out.printf(n1While + " ");

        n1While++;

    }

    System.out.println();

    do{
        System.out.printf(n1DoWhile + " ");

        n1DoWhile++;

    }while(n1DoWhile <= n2DoWhile); 

    System.out.println();

    for(int i = n1; i <= n2; i++){
        System.out.printf(i + " ");
    }

    input.close();
 
    }
    
}
