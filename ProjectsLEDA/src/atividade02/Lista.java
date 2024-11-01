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
	public Filme_IF search(long id) throws NotFoundException {
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
			throw new NilException("Lista vazia, o Fim nao pode ser retornado");
		}
		return fim.getValor();
	}
	
	
	public Filme_IF[] toArray() {
		Filme_IF[] filmes = new Filme_IF[tam];
		
		NoLista aux = ini;
		int cont = 0;
		while(!(aux.isNil())){
			filmes[cont] = aux.getValor();
			aux = aux.getProx();
			cont++;
		}
		return filmes;
	}
	
	public Lista toList(Filme_IF array[]) {
		if(array == null) {
			return null;
		}
		
		Lista list = new Lista();
		for(int i=0; i<tam; i++) {
			list.insert(array[i]);
		}
		
		return list;
	}
	
	public Lista ordernar() {
		Filme_IF[] filmes = toArray();
		mergeSort(filmes);

		return toList(filmes);
	}
	
	public void mergeSort(Filme_IF[] filmes) {
		int n = filmes.length;
		if(n==1) {
			return;
		} 
		
		int meio = n/2;
		Filme_IF[] left = new Filme_IF[meio];
		Filme_IF[] right = new Filme_IF[n- meio];
		
		for(int i=0; i<meio; i++) {
			left[i] = filmes[i];
		}
		
		for(int i=meio; i<n; i++) {
			right[i - meio] = filmes[i];
		}
		
		mergeSort(left);
		mergeSort(right);
		
		mergeTwoSortedLists(filmes, left, right);
		
	}
	
	public void mergeTwoSortedLists(Filme_IF[] filmes, Filme_IF[] left, Filme_IF[] right) {
		int leftSize = left.length;
		int rightSize = right.length;
		
		int i=0, j=0, k=0;
		
		while(i<leftSize && j < rightSize ) {
			
			if(left[i].compareTo(right[j]) <= -1) {
				filmes[k] = left[i];
				i++;
			}
			else {
				filmes[k] = right[j];
				j++;
			}
			
			k++;
		}
		
		while(i<leftSize) {
			filmes[k] = left[i];
			i++;
			k++;
		}
		
		while(j<rightSize) {
			filmes[k] = right[j];
			j++;
			k++;
		}
		
		
	}
		
		
		
	

	@Override
	public int size() {
		return tam;
	}
	
	public String print(NoLista no) {
		if(no.isNil()) {
			return "";
		}
		//System.out.println(no.getValor());
		return no.getValor().toString() + "\n" +  print(no.getAnt());
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
