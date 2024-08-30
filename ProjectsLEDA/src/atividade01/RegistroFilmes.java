package atividade01;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class RegistroFilmes {

	public static void main(String[] args) {
		
		//apenas para testar
		Filme f1 = new Filme("Caroline", 2004, 3);
		Filme f2 = new Filme("Nemo", 1944, 4);
		Filme f3 = new Filme("Lisbela", 2004, 5);
		Filme f4 = new Filme("Divertidamente", 2004, 5);
		Filme f5 = new Filme("A que pena seria", 2008, 4);
		Filme f6 = new Filme("A pequena sereia", 2000, 3);
		Filme f7 = new Filme("O menino do pijama listrado", 2015, 2);
		Filme f8 = new Filme("O pijama do menino listrado", 2000, 1);
		Filme f9 = new Filme("Tarzan", 1994, 5);
		Filme f10 = new Filme("Zootopia", 2017, 5);
		
		Filme[] filmes = {f1, f2, f3, f4, f5, f6, f7, f8, f9, f10};
		
		
		
		//for (Filme f : filmes) System.out.print(f);
		/*
		ordenar.insertionSort(filmes);
		*/
		//Collections.sort(lista);
		//System.out.println("Lista Ordenada:");
		//System.out.println(lista);
		
		
		
		for (Filme f : filmes) {
			System.out.println(f);
		}
		
		
		System.out.println("Lista Ordenada:");
		Ordenacao.quickSort(filmes, 0, filmes.length-1);
		
		for (Filme f : filmes) {
			System.out.println(f);
		}
		
		Busca_IF busca = new Busca();
		Filme filmeEncontrado;
		
		//filmeEncontrado = busca.buscaLinearRecursiva(filmes, 2);
		filmeEncontrado = busca.buscaBinariaRecursiva(filmes, 3);
		
		System.out.println(filmeEncontrado);
		
		
	}

}
