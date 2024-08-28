package atividade01;

public class Filme implements Comparable<Filme>{
	
	private String nome;
	private int nota;
	private int ano;
	
	Filme(String nome, int nota, int ano){
		this.nome = nome;
		this.nota = nota;
		this.ano = ano;
	}
	
	@Override
	public int compareTo(Filme o) {
		// TODO 
		return 0;
	}

	
	@Override
	public String toString() {
		// TODO
		return "Filme [nome=" + nome + ", nota=" + nota + ", ano=" + ano + "]";
	}

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
