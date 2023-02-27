import java.util.Scanner;

public class q4 {
    
    private static double media(int n1, int n2, int n3){
        return (n1+n2+n3)/3;
    }
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = input.nextInt();
        System.out.print("Digite o terceiro número: ");
        int n3 = input.nextInt();

        System.out.println("Media: " + media(n1, n2, n3));

        input.close();

    }
}
