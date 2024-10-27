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
		
		if(lista.isEmpty()) {
			return "";
		}
		
        if (lista.size() == 1 || no == lista.getFim()) {
            IDs = Long.toString(no.getValor().getID());
        } else if (lista.size() > 1 && no != lista.getFim()) {
        	
        	IDs += (Long.toString(lista.getIni().getValor().getID()) + ", " + imprimirLista(lista, no.getProx()));
        }
        
        return IDs;
    }
	
	
	private int h(long K) {
		
		return (int) K % m;
	}

}
