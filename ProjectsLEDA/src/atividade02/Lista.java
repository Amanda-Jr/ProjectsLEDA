package atividade02;

public class Lista implements Lista_IF{
	private NoLista ini;
	private NoLista fim;
	private int tam;
	
	Lista(){
		tam = 0;
	}

	@Override
	public Filme_IF remove(long id) throws Exception {
		
		return null;
	}

	@Override
	public void insert(Filme_IF elemento) {
		
		
	}

	@Override
	public boolean isEmpty() {
		
		return false;
	}

	@Override
	public Filme_IF search(long id) throws Exception {
		
		return null;
	}

	@Override
	public Filme_IF head() throws Exception {
		
		return null;
	}

	@Override
	public Filme_IF tail() throws Exception {
		
		return null;
	}

	@Override
	public int size() {
		return tam;
	}
	
	

	public NoLista getIni() {
		return ini;
	}

	public void setIni(NoLista ini) {
		this.ini = ini;
	}

	public NoLista getFim() {
		return fim;
	}

	public void setFim(NoLista fim) {
		this.fim = fim;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}
	
	

}
