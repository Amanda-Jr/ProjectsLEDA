package atividade01;

public class Busca implements Busca_IF{

	@Override
	public Filme buscaLinearIterativa(Filme[] filmes, int nota) throws NotaOutOfBoundsException {
		if(nota < 0 || nota > 5) {
			throw new NotaOutOfBoundsException("Nota Inválida! Digite uma nota entre 1 e 5.");
		}
		for(int i=0; i<filmes.length; i++) {
			if(filmes[i].getNota() == nota) {
				return filmes[i];
			}
		}
		return null;
	}

	@Override
	public Filme buscaLinearRecursiva(Filme[] filmes, int nota) {
		return buscaLinearRecursivaAuxiliar(filmes, nota, 0);
	}
	
	public Filme buscaLinearRecursivaAuxiliar(Filme[] filmes, int nota, int i) {
		Filme achado = null;
		if(i < filmes.length) {
			if(filmes[i].getNota() == nota) {
				achado = filmes[i];
				return achado;
			}
			else {
				buscaLinearRecursivaAuxiliar(filmes, nota, i+1);
			}
		}
		
		return achado;
	}

	@Override
	public Filme buscaBinariaIterativa(Filme[] filmes, int nota) {
		// TODO Stephany
		return null;
	}

	@Override
	public Filme buscaBinariaRecursiva(Filme[] filmes, int nota) {
		// TODO Amanda
		return buscaBinariaRecursivaAuxiliar(filmes, nota, 0, filmes.length-1);
	}
	
	public Filme buscaBinariaRecursivaAuxiliar(Filme[] filmes, int nota, int menor, int maior) {
		// TODO Amanda
		
		int media = (menor + maior)/2;
		if(menor > maior) {
			return null;
		}
		if(filmes[media].getNota() == nota) {
			return filmes[media];
		}
		else if(filmes[media].getNota() < nota) {
			return buscaBinariaRecursivaAuxiliar(filmes, nota, media+1, maior);
		}
		else {
			return buscaBinariaRecursivaAuxiliar(filmes, nota, menor, media-1);
		}
	}

	@Override
	public Filme buscaLinearIterativaDuasPontas(Filme[] filmes, int nota) {
		// TODO Stephany
		return null;
	}
	
	
	
}
