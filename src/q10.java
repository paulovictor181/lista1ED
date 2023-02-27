import java.util.Scanner;

public class q10 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int n1 = input.nextInt();

        if(n1 % 2 == 0){
            System.out.println("O número " + n1 + " é par");

        }else{
            System.out.println("O número " + n1 + " é impar");

        }

        input.close();
    }
}
