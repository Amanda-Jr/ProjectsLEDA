package atividade01;

public interface Busca_IF {
	
	boolean checaVetorOrdenado(Filme[] filmes);
	Filme buscaLinear_iterativa(Filme[] filmes, int nota) throws NotaOutOfBoundsException;
	Filme buscaLinear_recursiva(Filme[] filmes, int nota) throws NotaOutOfBoundsException;
	Filme buscaBinaria_iterativa(Filme[] filmes, int nota) throws NotaOutOfBoundsException;
	Filme buscaBinaria_recursiva(Filme[] filmes, int nota) throws NotaOutOfBoundsException;
	Filme buscaLinear_iterativa_duasPontas(Filme[] filmes, int nota) throws NotaOutOfBoundsException;
}
