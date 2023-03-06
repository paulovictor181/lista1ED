import java.util.Scanner;

public class q23 {

    public static void main (String[] args)throws Exception{
        
        Scanner input = new Scanner(System.in);
    
        System.out.print("Digite o número para receber seu fatorial: ");
        int n1 = input.nextInt();
        
        int fatorial = 1;
        
        while(n1 > 1){
            
            fatorial =  n1 * fatorial ;
            n1--;
        }
    
        System.out.println("Fatorial:" + fatorial);
    
        input.close();
     
        }
        
}
