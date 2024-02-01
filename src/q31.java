import java.util.Scanner;

public class q31 {
    static class Pessoa{
        String cpf;
        String nome;
        int idade;
        String sexo;
        double peso;
        double altura;
        double imc;

        public Pessoa(String cpf, String nome, int idade, String sexo, double peso, double altura) {
            this.cpf = cpf;
            this.nome = nome;
            this.idade = idade;
            this.sexo = sexo;
            this.peso = peso;
            this.altura = altura;
            imc = peso/Math.pow(altura, 2);
        }

        @Override
        public String toString() {
            String pessoaInformacoes = "CPF: " + cpf + " Nome: " + nome + " Idade: " + idade + " Sexo: " + sexo
                                        + " Peso: " + peso + " Altura: " + altura + " IMC: " + imc + "\n";
            return pessoaInformacoes;
        }

        
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de pessoas que deseja registrar: ");
        int qtdDePessoas = input.nextInt();

        System.out.println("ALERT: Número de ponto flutuante estão no padrão Brasileiro use ','");

        Pessoa[] pessoas = new Pessoa[qtdDePessoas];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Pessoa[" + i + "]");

            System.out.print("cpf: "); 
            String cpf = input.next();
            input.nextLine();

            System.out.print("nome: ");
            String nome = input.nextLine();

            System.out.print("idade: ");
            int idade = input.nextInt();
            input.nextLine();

            System.out.print("sexo: ");
            String sexo = input.nextLine();

            System.out.print("peso: ");
            double peso = input.nextDouble();

            System.out.print("altura: ");
            double altura = input.nextDouble();

            pessoas[i] = new Pessoa(cpf,nome,idade,sexo,peso,altura);
        }
        
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i].toString());
        }

        input.close();
    }
}