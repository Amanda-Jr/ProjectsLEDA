package atividade02;

import java.util.Random;


public class Testes {
	
	private static long idFixo = 1;
	
	private static String gerarNomeAleatorio(int comprimento) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder nomeBuilder = new StringBuilder(comprimento);
        
        for (int i = 0; i < comprimento; i++) {
            int indice = random.nextInt(caracteres.length());
            nomeBuilder.append(caracteres.charAt(indice));
        }
        
        return nomeBuilder.toString();
    }
    
    public static Filme_IF gerarFilmeAleatorio() {
        Random random = new Random();
        
        int comprimentoNome = 5 + random.nextInt(11);
        String nome = gerarNomeAleatorio(comprimentoNome);
        int ano = 1980 + random.nextInt(2024 - 1980 + 1);
        int nota = 1 + random.nextInt(5);
        long id = idFixo;
        idFixo++;
        
        return new Filme(nome, nota, ano, id);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
