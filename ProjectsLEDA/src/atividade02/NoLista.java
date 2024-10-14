package atividade02;

public class NoLista {
	
	private Filme_IF valor;
	private NoLista prox;
	private NoLista ant;
	
	public NoLista() {
		
	}
	
	public NoLista(Filme_IF valor) {
		this.valor = valor;
		prox = null;
		ant = null;
	}

	public boolean isNil() {
		if(valor == null) {
			return true;
		}
		
		return false;
	}

	public Filme_IF getValor() {
		return valor;
	}

	public void setValor(Filme_IF valor) {
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

	@Override
	public String toString() {
		return "NoLista [valor=" + valor + ", prox=" + prox + ", ant=" + ant + "]";
	}
	
	
}
