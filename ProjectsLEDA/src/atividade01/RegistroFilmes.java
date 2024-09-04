package atividade01;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class RegistroFilmes {

	public static void main(String[] args) {
		
		//apenas para testar
		System.out.println("\nLista Original:");
		Filme f1 = new Filme("Caroline", 2004, 3);
		Filme f2 = new Filme("Nemo", 1994, 4);
		Filme f3 = new Filme("Lisbela", 2004, 5);
		Filme f4 = new Filme("Divertidamente", 2004, 5);
		Filme f5 = new Filme("A que pena seria", 2008, 4);
		Filme f6 = new Filme("A pequena sereia", 2000, 3);
		Filme f7 = new Filme("O menino do pijama listrado", 2015, 2);
		Filme f8 = new Filme("O pijama do menino listrado", 2000, 2);
		Filme f9 = new Filme("Tarzan", 1994, 4);
		Filme f10 = new Filme("Zootopia", 2017, 5);
		
		Filme[] filmes = {f1, f2, f3, f4, f5, f6, f7, f8, f9, f10};
		
		
		
		for (Filme f : filmes) {
			System.out.println(f);
		}
		
		Ordenacao ordenacao = new Ordenacao();
		//ordenacao.quickSort(filmes.clone());
		//ordenacao.quickSortRandom(filmes.clone());
		//ordenacao.insertionSort(filmes.clone());
		ordenacao.mergeSort(filmes.clone());
		//ordenacao.countingSort(filmes.clone());
		
		Busca_IF busca = new Busca();
		Filme filmeEncontrado;
		
		if(ordenacao.checaVetorOrdenado(filmes)) {
			System.out.println("\nLista Ordenada:");
			
			for (Filme f : filmes) {
				System.out.println(f);
			}
			
			try {
					
				//filmeEncontrado = busca.buscaLinear_iterativa(filmes.clone(), 4);
				//filmeEncontrado = busca.buscaLinear_recursiva(filmes.clone(), 2);
				//filmeEncontrado = busca.buscaBinaria_iterativa(filmes.clone(), -1);
				//filmeEncontrado = busca.buscaBinaria_recursiva(filmes.clone(), 1);
				filmeEncontrado = busca.buscaLinear_iterativa_duasPontas(filmes, 2);
					
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
