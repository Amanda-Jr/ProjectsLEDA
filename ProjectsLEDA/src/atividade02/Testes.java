package atividade02;

import java.util.Random;


public class Testes {
	
	/*
	Além do código, os grupos devem entregar um relatório em formato 
	de documento Google, comparando a complexidade de tempo das operações 
	nas diferentes estruturas de dados utilizadas (BST, Tabela Hash e Fila) 
	e discutindo os trade-offs entre elas.
	
	Inserção de filmes.
	Busca de filmes.
	Remoção de filmes.
	Exibição de filmes ordenados.
	
	*/
	
	private static long idFixo = 1;
	
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
    
    public static Filme_IF gerarFilmeAleatorio() {
        Random random = new Random();
        
        int comprimentoNome = 5 + random.nextInt(11);
        String nome = gerarNomeAleatorio(comprimentoNome);
        int ano = 1980 + random.nextInt(2024 - 1980 + 1);
        int nota = 1 + random.nextInt(5);
        long id = idFixo;
        idFixo++;
        
        return new Filme(nome, nota, ano, id);
    }
	
	public static void main(String[] args) {
		long tempoInicial = 0;
		long tempoFinal = 0;
		final int tamanho = 1000000;
		Filme[] filmes = new Filme[tamanho];
		
		//Fila fila = new Fila();
		TabelaHash tab = new TabelaHash();
		//AVL avl = new AVL();
		
		for(int i=0; i<tamanho; i++) {
			Filme_IF filmeAleatorio = gerarFilmeAleatorio();
			tab.insert(filmeAleatorio);
		}
		
		
		Filme_IF filmeEncontrado = null;
		
		for(int i=0; i<10; i++) {
			long tIni = System.nanoTime();
			tempoInicial = tempoInicial + tIni;

						
				try {
					filmeEncontrado = tab.search(5000);
					
				} catch (Exception e) {
						
					System.err.println(e.getMessage());
				}
					

			long tFim = System.nanoTime();
			System.out.println((tFim - tIni)/1000000000.0);
			tempoFinal = tempoFinal + tFim;
		}
		
		
		System.out.println(filmeEncontrado);
		System.out.println((tempoFinal - tempoInicial)/10000000000.0);
		
		
	}
		

	

}
