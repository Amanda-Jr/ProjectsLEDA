package atividade02;

public interface Lista_IF {

	public Filme_IF remove(long id) throws Exception;
	
	public void insert(Filme_IF elemento);
	
	public boolean isEmpty();
	
	public Filme_IF search(long id) throws Exception;
	
	public Filme_IF head() throws Exception;
	
	public Filme_IF tail() throws Exception;
	
	public int size();
}
