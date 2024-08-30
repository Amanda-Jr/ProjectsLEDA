package atividade01;

public class Filme implements Comparable<Filme>{
	private String nome;
	private int ano, nota;
	
	Filme(String nome, int ano, int nota){
		this.nome = nome;
		this.ano = ano;
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return "Filme [nome=" + nome + ", ano=" + ano + ", nota=" + nota + "]";
	}

	@Override
    public int compareTo(Filme outro) {
    	if (this.nota != outro.nota) {
    		return -1 * Integer.compare(this.nota, outro.nota);
    	} else if (this.ano != outro.ano) {
    		return Integer.compare(this.ano, outro.ano);
    	}   else {
    		return this.nome.compareTo(outro.nome);
    	}
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
