import java.util.Scanner;

public class q18 {
    public static void main (String[] args)throws Exception{
        
        String senhaCerta = "coxinha123";

        Scanner input = new Scanner(System.in);

        System.out.println("!!!!VERIFICAÇÃO DE SENHA COM WHILE!!!!");
    
        System.out.printf("Digite sua senha: ");
        String senhaRecebida = input.nextLine();

        System.out.println();
        
        while(!senhaRecebida.equals(senhaCerta)){

            System.out.println("Senha Incorreta");
            System.out.println();
            System.out.printf("Digite sua senha novamente: ");
            senhaRecebida = input.nextLine();
            System.out.println();
        }
        
        System.out.println("Senha Correta!!!");
        
    
        System.out.println();

        System.out.println("!!!!VERIFICAÇÃO DE SENHA COM DO WHILE!!!!");

        System.out.printf("Digite sua senha: ");
        senhaRecebida = input.nextLine();

        System.out.println();
    
        do{
        
        if(!senhaRecebida.equals(senhaCerta)){

            System.out.println("Senha Incorreta");
            System.out.println();
            System.out.printf("Digite sua senha novamente: ");
            senhaRecebida = input.nextLine();
            System.out.println();  

        }
          
        }while(!senhaRecebida.equals(senhaCerta)); 

        System.out.println("Senha Correta!!!");
        
        input.close();
     
        }
    
}
