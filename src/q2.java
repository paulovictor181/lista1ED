import java.util.Scanner;

public class q2 {
    
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.print("Digite sua altura: ");
        double altura = input.nextDouble();
        System.out.print("Digite a primeira letra do seu nome: ");
        char primeiraLetra = input.next().charAt(0);

        input.nextLine();

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        
        System.out.println("Nome: " + nome + " | Primeira Letra: " + primeiraLetra + " | idade: " + idade + " | Altura: " + altura + " | ");

        input.close();
    }
}
