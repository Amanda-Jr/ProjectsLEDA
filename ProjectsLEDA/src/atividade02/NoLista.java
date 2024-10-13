package atividade02;

public class NoLista {
	
	public Filme valor;
	public NoLista prox;
	public NoLista ant;
	
	public boolean isNil() {
		if(valor == null) {
			return true;
		}
		
		return false;
	}
}
