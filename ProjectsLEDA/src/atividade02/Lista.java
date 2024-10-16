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
		tam++;
	}

	@Override
	public Filme_IF remove(long id) throws Exception {
		NoLista aux = new NoLista();
		aux = ini;
		
		if(ini.getValor().getID() == id) {
			ini = ini.getProx();
			return aux.getValor();
		}
		else {
			while((!(aux).isNil()) && aux.getValor().getID() != id ) {
				aux = aux.getProx();
			}
			if(aux.isNil()) {
				throw new NotFoundException("\nO Filme não está na lista.");
			}
			aux.getAnt().setProx(aux.getProx());
			aux.getProx().setAnt(aux.getAnt());
			tam--;
			return aux.getValor();
		}
	}



	@Override
	public boolean isEmpty() {
		if(ini.isNil()) {
			return true;
		}
		return false;
	}

	@Override
	public Filme_IF search(long id) throws Exception {
		NoLista aux = new NoLista();
		aux = ini;
		
		while(!((aux).isNil()) && aux.getValor().getID() != id ) {
			aux = aux.getProx();
		}
		if(aux.isNil()) {
			throw new NotFoundException("\nFilme não Encontrado");
		}
		
		return aux.getValor();
	}
		

	@Override  
	public Filme_IF head() throws Exception {
		
		if(ini.isNil()) { 
			throw new NilException("Lista vazia, o Inicio nao pode ser retornado");
		}
		return ini.getValor();
	}

	@Override
	public Filme_IF tail() throws Exception {
		
		if(fim.isNil()) { 
			throw new NilException("Lista vazia, o Inicio nao pode ser retornado");
		}
		return fim.getValor();
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
