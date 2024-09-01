package atividade01;

public class Busca implements Busca_IF{
	
	@Override
	public boolean checaVetorOrdenado(Filme[] filmes) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Filme buscaLinear_iterativa(Filme[] filmes, int nota) throws NotaOutOfBoundsException {
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
	public Filme buscaLinear_recursiva(Filme[] filmes, int nota) {
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
	public Filme buscaBinaria_iterativa(Filme[] filmes, int nota) {
<<<<<<< HEAD
	    int inicio = 0;
=======
		    int inicio = 0;
>>>>>>> refs/remotes/origin/main
        int fim = filmes.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;
            if (filmes[meio].getNota() == nota) {
                return filmes[meio];
            }
            if (filmes[meio].getNota() < nota) {
                inicio = meio + 1;
            }
            else {
                fim = meio - 1;
            }
        }
		return null;
	}

	@Override
	public Filme buscaBinaria_recursiva(Filme[] filmes, int nota) {
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
	public Filme buscaLinear_iterativa_duasPontas(Filme[] filmes, int nota) throws NotaOutOfBoundsException {
		 int inicio = 0;
<<<<<<< HEAD
	        int fim = filmes.length - 1;
	        if (nota < 1 || nota > 5) {
	            throw new NotaOutOfBoundsException("Nota " + nota + " fora dos limites permitidos (1-5).");
	        }
	        while (inicio <= fim) {
	            if (filmes[inicio].getNota() == nota) {
	                return filmes[inicio];
	            }
	            if (filmes[fim].getNota() == nota) {
	                return filmes[fim];
	            }

	            inicio++;
	            fim--;
	        }
	        return null;
	}
	
	
	
}
=======
        int fim = filmes.length - 1;
        if (nota < 1 || nota > 5) {
            throw new NotaOutOfBoundsException("Nota " + nota + " fora dos limites permitidos (1-5).");
        }
        while (inicio <= fim) {
            if (filmes[inicio].getNota() == nota) {
                return filmes[inicio];
            }
            if (filmes[fim].getNota() == nota) {
                return filmes[fim];
            }

            inicio++;
            fim--;
        }
        return null;
    }
>>>>>>> refs/remotes/origin/main
