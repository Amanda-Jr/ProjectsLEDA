package atividade01;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class RegistroFilmes {

	public static void main(String[] args) {
		
		//apenas para testar
		System.out.println("\nLista Original:");
		Filme f1 = new Filme("Caroline", 3, 2004);
		Filme f2 = new Filme("Nemo", 4, 1994 );
		Filme f3 = new Filme("Lisbela", 5, 2004);
		Filme f4 = new Filme("Divertidamente", 5, 2004);
		Filme f5 = new Filme("A que pena seria", 4, 2008);
		Filme f6 = new Filme("A pequena sereia", 3, 2000);
		Filme f7 = new Filme("O menino do pijama listrado", 2, 2015);
		Filme f8 = new Filme("O pijama do menino listrado", 2, 2000);
		Filme f9 = new Filme("Tarzan", 4, 1994);
		Filme f10 = new Filme("Zootopia", 5, 2017);
		
		Filme[] filmes = {f1, f2, f3, f4, f5, f6, f7, f8, f9, f10};
		
		
		
		for (Filme f : filmes) {
			System.out.println(f);
		}
		
		Ordenacao ordenacao = new Ordenacao();
		//ordenacao.quickSort(filmes);
		//ordenacao.quickSortRandom(filmes);
		//ordenacao.insertionSort(filmes);
		ordenacao.mergeSort(filmes);
		//ordenacao.countingSort(filmes);
		
		Busca_IF busca = new Busca();
		Filme filmeEncontrado;
		
		if(ordenacao.checaVetorOrdenado(filmes.clone())) {
			System.out.println("\nLista Ordenada:");
			
			for (Filme f : filmes) {
				System.out.println(f);
			}
			
			try {
					
				filmeEncontrado = busca.buscaLinear_iterativa(filmes, 5);
				//filmeEncontrado = busca.buscaLinear_recursiva(filmes, 2);
				//filmeEncontrado = busca.buscaBinaria_iterativa(filmes, -1);
				//filmeEncontrado = busca.buscaBinaria_recursiva(filmes, 1);
				//filmeEncontrado = busca.buscaLinear_iterativa_duasPontas(filmes, 2);
					
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
			for (Filme f : filmes) {
				System.out.println(f);
			}
		}
		
		

		
		
	}

}
