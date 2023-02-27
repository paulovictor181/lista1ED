public class q33_2 {
	static class Letra {
	  String letra = "";
	  int cont = 0;
	}
  
	public static void main(String[] args) {
	  // Entrada de dados:
	  String palavra = "casa";
  
	  // Separar a palavra em um vetor de letras:
	  String[] arrayLetras = palavra.split("");
	  int sizeLetras = arrayLetras.length;
  
	  // Inicializo dicionario
	  Letra dicionario[] = new Letra[sizeLetras];
	  for (int i = 0; i < sizeLetras; i++) {
		dicionario[i] = new Letra();
	  }
  
	  // Variaveis de controle
	  boolean flagExiste = false;
	  int iExiste = 0; // indice da letra encontrada
	  int iNova = 0; // indice da letra nova
  
	  // PERCORRER CADA LETRA DA PALAVRA:
	  for (int p = 0; p < sizeLetras; p++) {
		// Letra atual
		String letra = arrayLetras[p];
  
		// PROCURAR NA ESTRUTURA SE JA EXISTE LETRA
		flagExiste = false;
  
		for (iExiste = 0; iExiste < sizeLetras; iExiste++) {
		  if (dicionario[iExiste].letra.equals(letra) == true) {
			flagExiste = true;
			break;
		  }
		}
  
		if (flagExiste == true) {
		  // Incrementa o contador das palavras que existem
		  dicionario[iExiste].cont++;
		} else {
		  // Adiciona nova palavra ao dicionario
		  dicionario[iNova].letra = letra;
		  dicionario[iNova].cont = 1;
		  iNova++;
		}
  
	  }
  
	  // Imprimir na tela todas as letras encontradas e seu contador
	  for (int i = 0; i < iNova; i++) {
		System.out.println(dicionario[i].letra + " : " + dicionario[i].cont);
	  }
  
	}
  
  }