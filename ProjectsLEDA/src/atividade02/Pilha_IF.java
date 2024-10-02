package atividade02;

public interface Pilha_IF {

	public Filme_IF pop() throws Exception;
	
	public void push(Filme_IF elemento);
	
	public boolean isEmpty();
	
	public Filme_IF top() throws Exception;
	
}
