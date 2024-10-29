package atividade02;

public class Fila implements Fila_IF{
	
	Pilha p1 = new Pilha();
	Pilha p2 = new Pilha();
	
	
	@Override 
	public void enqueue(Filme_IF elemento) {
		p1.push(elemento);
	}

	@Override
	public Filme_IF dequeue() throws Exception {
		while(!p1.isEmpty()) {
			p2.push(p1.pop());
		}
		Filme_IF removido = p2.pop();
		while(!p2.isEmpty()) {
			p1.push(p2.pop());
		}
		return removido;
	}

	
	@Override
	public boolean isEmpty() {
		return p1.isEmpty();
	}

	@Override
	public Filme_IF head() throws Exception {
		return p1.top();
	}

}
