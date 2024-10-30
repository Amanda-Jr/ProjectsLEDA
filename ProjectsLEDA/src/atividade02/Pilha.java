package atividade02;

public class Pilha implements Pilha_IF{
	
	Lista lista = new Lista();
	
	public Pilha() {
		
	}
	
	@Override
	public Filme_IF pop() throws Exception {
		return lista.remove(lista.head().getID());
	}
	

	@Override
	public void push(Filme_IF elemento) {
		lista.insert(elemento);
	}

	@Override
	public boolean isEmpty() {
		return lista.isEmpty();
	}

	@Override
	public Filme_IF top() throws Exception {
		
		return lista.head();
	}
	
	public void print() {
		lista.print();
	}
	
}
