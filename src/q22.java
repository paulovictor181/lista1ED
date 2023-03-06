import java.util.Scanner;

public class q22 {
    
    public static void main (String[] args)throws Exception{
        
        Scanner input = new Scanner(System.in);
    
        System.out.println("Digite o número incial da contagem: ");
        int n1 = input.nextInt();
    
        System.out.println("Digite o número final da contagem: ");
        int n2 = input.nextInt();
        
        int somatario = 0;
        
        while(n1 <= n2){
            
            somatario = somatario + n1;
            n1++;
        }
    
        System.out.println("Somatorio de todos os números inteiros entre eles:" + somatario);
    
        input.close();
     
        }
        
}
