public class q33 {
	
	static class Letra{
		char letra;
		int qtd;
	
		public Letra(int qtd){
			this.qtd = qtd;
		}
	
		public Letra(char letra, int qtd){
			this.letra = letra;
			this.qtd = qtd;
		}
	
	}
	public static void main(String[] args) {
		
		// Entrada de Dados:
		String palavra = "testamento";
		// Inicialização do vetor do tipo Letra
		Letra[] vetorLetra = new Letra[palavra.length()];
		
		// forI criado para pecorrer o vetorLetra e preencher
		for(int i = 0; i < palavra.length(); i++ ) {

			// Verifica se o elemento vetorLetra[i] é null para evitar null.point.exception
			if(vetorLetra[i] == null){
			// Inicializa construtor para preencher o vetor
			vetorLetra[i] = new Letra(palavra.charAt(i), 0);
			}  

			for (int j = 0; j <= i; j++) {
				// Conta a letra que está sendo verificada no momento
                if (vetorLetra[i].letra == palavra.charAt(j)) {
                    vetorLetra[i].qtd++;

                }
            }

			// Exibir letra + contador na tela
			System.out.println(vetorLetra[i].letra + " = " + vetorLetra[i].qtd);
		}

		
	}



		
	
			
}

