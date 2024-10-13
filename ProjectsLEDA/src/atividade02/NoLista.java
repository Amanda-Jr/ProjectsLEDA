package atividade02;

public class NoLista {
	
	private Filme valor;
	private NoLista prox;
	private NoLista ant;
	
	public boolean isNil() {
		if(valor == null) {
			return true;
		}
		
		return false;
	}

	public Filme getValor() {
		return valor;
	}

	public void setValor(Filme valor) {
		this.valor = valor;
	}

	public NoLista getProx() {
		return prox;
	}

	public void setProx(NoLista prox) {
		this.prox = prox;
	}

	public NoLista getAnt() {
		return ant;
	}

	public void setAnt(NoLista ant) {
		this.ant = ant;
	}
	
	
}
