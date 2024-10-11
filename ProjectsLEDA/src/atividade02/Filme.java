package atividade02;

public class Filme implements Filme_IF{
	private String nome;
	private int ano, nota;
	private long ID;
	
	Filme(String nome, int ano, int nota, long ID){
		this.nome = nome;
		this.ano = ano;
		this.nota = nota;
		this.ID = ID;
	}
	
	@Override
	public int compareTo(Filme_IF outro_filme) {
		if(this.ID != outro_filme.getID()) {
			return Long.compare(this.ID, outro_filme.getID());
		}
		else if (this.nota != outro_filme.getNota()) {
    		return -1 * Integer.compare(this.nota, outro_filme.getNota());
    	} 
		else if (this.ano != outro_filme.getAno()) {
    		return Integer.compare(this.ano, outro_filme.getAno());
    	} 
		else {
    		return this.nome.compareTo(outro_filme.getNome());
    	}
		
	}
	
	public int compareToNota(Filme_IF outro_filme) {
    	if (this.nota != outro_filme.getNota()) {
    		return -1 * Integer.compare(this.nota, outro_filme.getNota());
    	} 
    	return 0;
	}
	
	
	@Override
	public long getID() {
		return this.ID;
	}
	
	@Override
	public void setID(long ID) {
		this.ID = ID;
		
	}
	
	@Override
	public String getNome() {
		return this.nome;
	}
	
	@Override
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	@Override
	public int getNota() {
		return this.nota;
	}
	
	@Override
	public void setNota(int nota) {
		this.nota = nota;
		
	}
	
	@Override
	public int getAno() {
		return this.ano;
	}
	
	@Override
	public void setAno(int ano) {
		this.ano = ano;
		
	}
	
}
