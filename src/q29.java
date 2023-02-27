import java.util.Scanner;

public class q29 {
    public static void main(String[] args) throws Exception {
        
    	//variaveis
    	Scanner sc1 = new Scanner(System.in);

        int n = 0;
        int i;
        int ma;
        int me;
        int x;
        int y;

        //Criaçao do vetor
        System.out.println("Digite a quantidade de casas que o vetor possui: ");
        n = sc1.nextInt();

        int vetor[] = new int[n];

        //Alocando valores nas casas do vetor
        for (i=0; i<n ; i++){

            System.out.println("Informe os valores do vetor na casa "+i);
            vetor[i] = sc1.nextInt();
            
        }

        //Escolha qual a casa do vetor que sera modificada
        System.out.println("Digite a casa que você quer modificar");
        x = sc1.nextInt();

            ma = vetor[x];
            me = vetor[x-1];

        //Um for apenas para mostrar o vetor sem modificaçao
        for (i=0; i<n; i++){

                System.out.print(vetor[i]);
        }

        System.out.println("");

        //Loop para verificar se o valor da casa escolhida e menor do que o da casa anterior a ele
        while(me > ma){

            ma = vetor[x];
            me = vetor[x-1];
       
       //If para fazer a verificação do loop
            if (me > ma){

                y = me;
                vetor[x-1] = ma;
                vetor[x] = y;

            } else {

                break;

            }
       //Contagem de x para ele ser atualizado para casa anterior do vetor
            x = x-1;

       //For para mostrar o vetor se modificando
            for (i=0; i<n; i++){
                System.out.print(vetor[i]);
            }
            System.out.println("");
            
        }
        
        sc1.close();
    }

}