package atividade02;

public class TabelaHash implements TabelaHash_IF{
	
	private Lista[] t;
	private final int m = 13;
	
	public TabelaHash() {
		t = new Lista[m];
		for (int i = 0; i < m; i++) {
	        t[i] = new Lista(); 
	    }
	}
	
	@Override
	public Filme_IF remove(long id) throws Exception {
		return t[h(id)].remove(id);
	}

	@Override
	public void insert(Filme_IF elemento) {
		t[h(elemento.getID())].insert(elemento);
		
	}

	@Override
	public boolean isEmpty() {
		for(int i=0; i<m; i++) {
			if(!t[i].isEmpty()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public Filme_IF search(long id) throws Exception {
		return t[h(id)].search(id);
	}

	@Override
	public String print() {
		String filmes = "";
		for(int i=0; i<m; i++) {
			
			filmes += (i + ": " + imprimirLista(t[i], t[i].getIni()) + "\n");
		}
		return filmes;
	}
	
	private String imprimirLista(Lista lista, NoLista no) {
		String IDs = "";
		NoLista ini = lista.getFim();
		
		for(int i=0; i<lista.getTam(); i++) {
			if(!ini.isNil()) {
				if(ini == lista.getFim()) {
					IDs += Long.toString(ini.getValor().getID());
				}else {
					IDs += ", " + Long.toString(ini.getValor().getID());
				}
				
				ini = ini.getAnt();
			}
		}
        
        return IDs;
    }
	
	public void ordenar() {
		for(int i=0; i<m; i++) {
			if(!t[i].getIni().isNil()) {
				if(t[i].getIni() != t[i].getFim() ) {
					t[i] = t[i].ordernar();
				}
				
			}
			
		}
	}
	
	private int h(long K) {
		
		return (int) K % m;
	}

}
