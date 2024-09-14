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
		
		long tempoInicial = 0;
		long tempoFinal = 0;
		final int tamanho = 22000;
		Filme[] filmes = new Filme[tamanho];
		
		for(int i=0; i<tamanho; i++) {
			Filme filmeAleatorio = gerarFilmeAleatorio();
			filmes[i] = filmeAleatorio;
		}
		
		
		Filme[] filmesClone = filmes.clone();
		
		
		Ordenacao ordenacao = new Ordenacao();
		//ordenacao.bubbleSort(filmesClone);
		//ordenacao.selectionSort(filmesClone);
		//ordenacao.quickSort(filmesClone);
		//ordenacao.quickSortRandom(filmesClone);
		//ordenacao.insertionSort(filmesClone);
		//ordenacao.mergeSort(filmesClone);
		//ordenacao.countingSort(filmesClone);
		ordenacao.insertionSortInverso(filmesClone);
		
		
		Busca_IF busca = new Busca();
		Filme filmeEncontrado = null;
		
		for(int i=0; i<10; i++) {
			long tIni = System.nanoTime();
			tempoInicial = tempoInicial + tIni;
			
			if(ordenacao.checaVetorOrdenadoInverso(filmesClone)) {
				
				try {
						
					filmeEncontrado = busca.buscaLinear_iterativa(filmesClone, 4);
					//filmeEncontrado = busca.buscaLinear_recursiva(filmesClone, 2);
					//filmeEncontrado = busca.buscaBinaria_iterativa(filmesClone, 5);
					//filmeEncontrado = busca.buscaBinaria_recursiva(filmesClone, 1);
					//filmeEncontrado = busca.buscaLinear_iterativa_duasPontas(filmesClone, 3);
						
					
						
				} catch (NotaOutOfBoundsException e) {
					System.err.println(e.getMessage());
				}

			} else {
				System.out.println("--------------------------------");
				
			}
			
			
			
			long tFim = System.nanoTime();
			System.out.println((tFim - tIni)/1000000000.0);
			tempoFinal = tempoFinal + tFim;
		}
		
		
		System.out.println(filmeEncontrado);
		System.out.println((tempoFinal - tempoInicial)/10000000000.0);

		
		
	}

}
