import java.util.Scanner;

public class q5 {
    
    private static double media(double n1, double n2, double n3){
        return (n1+n2+n3)/3;
    }
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = input.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double n3 = input.nextDouble();

        System.out.println("Media: " + media(n1, n2, n3));

        input.close();

    }
}
