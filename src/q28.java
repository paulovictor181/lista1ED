public class q28 {
    public static void main(String[] args) {
        int[] inteiros = {64,42,7346,32,23,53};
        int[] resultado = verificarMaiorMenor(inteiros);
        
        System.out.println("Maior número: " + resultado[0]);
        System.out.println("Menor número: " + resultado[1]);
    }

    public static int[] verificarMaiorMenor(int[] inteiros){
        int maiorValor = inteiros[0];
        int menorValor = inteiros[0];
        
        for (int i = 1; i < inteiros.length; i++) {
            if(maiorValor < inteiros[i]){
                maiorValor = inteiros[i];
            }

            if(menorValor > inteiros[i]){
                menorValor = inteiros[i];
            }
        }

        int[] numeros = {maiorValor,menorValor};
        return numeros;
    }
}
