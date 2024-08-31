package atividade01;
import java.util.Random;;

public class Ordenacao {
	
	public static void embaralhar(Filme[] v) {

		Random random = new Random();

		for (int i=0; i < (v.length - 1); i++) {

			//sorteia um índice
			int j = random.nextInt(v.length);

			//troca o conteúdo dos índices i e j do vetor
			Filme temp = v[i];
			v[i] = v[j];
			v[j] = temp;
		}

	}
	
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

	
	public static void swap(Filme A[], int i, int j) {
		Filme temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	
	public static int partition(Filme A[], int left, int right) {
		Filme p = A[left];
		int i = left + 1;
		int j = right;
		
		while(i <= j) {
			if(A[i].compareTo(p) <= 0) {
				i++;
			}else if(A[j].compareTo(p) > 0) {
				j--;
			}else {
				swap(A, i, j);
			}
		}
		swap(A, left, j);
		return j;
	}
	
	public static void quickSort(Filme A[], int left, int right) {
		if(left < right) {
			int pivot = partition(A, left, right);
			quickSort(A, left, pivot-1);
			quickSort(A, pivot+1, right);
		}
	}
	
	public static void quickSortRandom(Filme A[], int left, int right) {
		embaralhar(A);
		if(left < right) {
			int pivot = partition(A, left, right);
			quickSort(A, left, pivot-1);
			quickSort(A, pivot+1, right);
		}
	}
}
