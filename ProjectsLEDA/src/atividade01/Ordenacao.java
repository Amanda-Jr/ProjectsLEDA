package atividade01;

public class Ordenacao {
	
	public void insertionSort(Filme[] filmes) {
		Filme menor;
		int j;
		
		for(int i=1; i<filmes.length; i++) {
			menor = filmes[i];
			j = i-1;
			while(j>0 && filmes[j] > menor) {
				filmes[j] = filmes[j+1];
				j--;
			}
			menor = filmes[j+1];
		}
	}
	
	public void mergeSort(Filme[] filmes) {
		
	}
	

	
	
	
}
