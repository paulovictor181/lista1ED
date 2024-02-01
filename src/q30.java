import java.util.Scanner;

public class q30 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua frase:");
        StringBuffer frase = new StringBuffer(input.nextLine());

        frase.reverse();

        System.out.println(frase);

        input.close();
    }
}
