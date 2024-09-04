package atividade01;

public class Filme implements Filme_IF{
	private String nome;
	private int ano, nota;
	
	Filme(String nome, int ano, int nota){
		this.nome = nome;
		this.ano = ano;
		this.nota = nota;
	}
	
	@Override
    public int compareTo(Filme_IF outro_filme) {
    	if (this.nota != outro_filme.getNota()) {
    		return -1 * Integer.compare(this.nota, outro_filme.getNota());
    	} else if (this.ano != outro_filme.getAno()) {
    		return Integer.compare(this.ano, outro_filme.getAno());
    	}   else {
    		return this.nome.compareTo(outro_filme.getNome());
    	}
	}
	
	@Override
	public String toString() {
		return  nome + " (" + ano + ") [" + nota + "]";
	}

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}

	
	
	
}
