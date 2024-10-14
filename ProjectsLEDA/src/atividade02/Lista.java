package atividade02;

public class Lista implements Lista_IF{
	private NoLista ini;
	private NoLista fim;
	private int tam;
	
	Lista(){
		ini = new NoLista();
		fim = ini;
		tam = 0;
	}
	
	@Override
	public void insert(Filme_IF elemento) {
		NoLista nill = new NoLista();
		
		NoLista noIni = new NoLista(elemento);
		noIni.setProx(ini); 
		noIni.setAnt(nill);
		ini.setAnt(noIni);
		
		
		if(ini.isNil()) { //lista vazia
			fim = noIni;
		}
		ini = noIni;
	}

	@Override
	public Filme_IF remove(long id) throws Exception {
		
		return null;
	}



	@Override
	public boolean isEmpty() {
		if(ini==null) {
			return true;
		}
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
