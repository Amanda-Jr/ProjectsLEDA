package atividade01;
import java.util.Random;


public class RegistroFilmes {
	
    private static String gerarNomeAleatorio(int comprimento) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder nomeBuilder = new StringBuilder(comprimento);
        
        for (int i = 0; i < comprimento; i++) {
            int indice = random.nextInt(caracteres.length());
            nomeBuilder.append(caracteres.charAt(indice));
        }
        
        return nomeBuilder.toString();
    }
    
    public static Filme gerarFilmeAleatorio() {
        Random random = new Random();
        
        int comprimentoNome = 5 + random.nextInt(11);
        String nome = gerarNomeAleatorio(comprimentoNome);
        int ano = 1980 + random.nextInt(2024 - 1980 + 1);
        int nota = 1 + random.nextInt(5);
        
        return new Filme(nome, nota, ano);
    }

	public static void main(String[] args) {
		
		
		
		final int tamanho = 10;
		Filme[] filmes = new Filme[tamanho];
		
		for(int i=0; i<tamanho; i++) {
			Filme filmeAleatorio = gerarFilmeAleatorio();
			filmes[i] = filmeAleatorio;
		}
		
		
		Filme[] filmesClone = filmes.clone();
		
		System.out.println("\nLista Original:");
		for (Filme f : filmesClone) {
			System.out.println(f);
		}
		
		Ordenacao ordenacao = new Ordenacao();
		//ordenacao.bubbleSort(filmesClone);
		//ordenacao.selectionSort(filmesClone);
		//ordenacao.quickSort(filmesClone);
		//ordenacao.quickSortRandom(filmesClone);
		//ordenacao.insertionSort(filmesClone);
		//ordenacao.mergeSort(filmesClone);
		ordenacao.countingSort(filmesClone);
		
		Busca_IF busca = new Busca();
		Filme filmeEncontrado;
		
		if(ordenacao.checaVetorOrdenado(filmesClone)) {
			System.out.println("\nLista Ordenada:");
			
			for (Filme f : filmesClone) {
				System.out.println(f);
			}
			
			try {
					
				filmeEncontrado = busca.buscaLinear_iterativa(filmesClone, 4);
				//filmeEncontrado = busca.buscaLinear_recursiva(filmesClone, 2);
				//filmeEncontrado = busca.buscaBinaria_iterativa(filmesClone, 5);
				//filmeEncontrado = busca.buscaBinaria_recursiva(filmesClone, 1);
				//filmeEncontrado = busca.buscaLinear_iterativa_duasPontas(filmesClone, 3);
					
				if(filmeEncontrado != null) {
					System.out.println("\nFilme encontrado: " + filmeEncontrado);
				}else {
					System.out.println("\nFilme não encontrado");
				}
					
			} catch (NotaOutOfBoundsException e) {
				System.err.println(e.getMessage());
			}

		} else {
			System.out.println("--------------------------------");
			for (Filme f : filmesClone) {
				System.out.println(f);
			}
		}
		
		

		
		
	}

}
