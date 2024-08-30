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
	//TODO - not finished
	public int compareTo(Filme outro) {
		if(this.nota != outro.nota) {
			if(this.nota < outro.nota) {
				return 1;
			}
			else if(this.nota > outro.nota){
				return -1;
			}
		} 
		else if (this.ano != outro.ano) {
			if(this.ano < outro.ano) {
				return -1;
			}
			else if(this.ano > outro.ano){
				return 1;
			}
		} 
		else if (!this.nome.equals(outro.nome)){
			return this.nome.compareTo(outro.nome);
		}
			
		return 0;
	}

	
	@Override
	public String toString() {
		// TODO
		return "Filme [nome = " + nome + ", nota = " + nota + ", ano = " + ano + "]\n";
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
