package atividade01;

public interface Busca_IF {
	//TODO exceptions here
	Filme buscaLinearIterativa(Filme[] filmes, int nota) throws NotaOutOfBoundsException;
	Filme buscaLinearRecursiva(Filme[] filmes, int nota);
	Filme buscaBinariaIterativa(Filme[] filmes, int nota);
	Filme buscaBinariaRecursiva(Filme[] filmes, int nota);
	Filme buscaLinearIterativaDuasPontas(Filme[] filmes, int nota);
}
