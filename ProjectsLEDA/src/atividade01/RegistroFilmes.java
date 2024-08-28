package atividade01;

import java.util.ArrayList;
import java.util.List;


public class RegistroFilmes {

	public static void main(String[] args) {
		
		//apenas para testar
		Filme f1 = new Filme("Caroline", 5, 2004);
		Filme f2 = new Filme("Nemo", 4, 1944);
		Filme f3 = new Filme("Divertidamente", 5, 2004);
		Filme f4 = new Filme("Lisbela", 5, 2004);
		Filme f5 = new Filme("A que pena seria", 4, 2008);
		Filme f6 = new Filme("A pequena sereia", 3, 2000);
		Filme f7 = new Filme("O menino do pijama listrado", 2, 2015);
		Filme f8 = new Filme("O pijama do menino listrado", 1, 2000);
		Filme f9 = new Filme("Tarzan", 5, 1994);
		Filme f10 = new Filme("Zootopia", 5, 2017);
		
		Filme[] filmes = {f1, f2, f3, f4, f5, f6, f7, f8, f9, f10};
		
		List<Filme> lista = new ArrayList<Filme>();
		
		for	(Filme f: filmes) {
			lista.add(f);
		}
		
		
		
		
	}

}
