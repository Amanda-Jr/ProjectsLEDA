package atividade01;
import java.util.Random;;

public class Ordenacao implements Ordenacao_IF{
	
	static Random random = new Random();

	@Override
	public boolean checaVetorOrdenado(Filme[] filmes) {
		
		for(int i=1; i<filmes.length-1; i++) {
			if(filmes[i].compareTo(filmes[i-1]) < 0) {
				return false;
			}
		}
		
		return true;
	}

	
	private static void embaralhar(Filme[] v) {

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
		
		for(int j=1; j<filmes.length; j++) {
			Filme key = filmes[j];
			int i = j-1;
			
			while(i>=0 && (filmes[i].compareTo(key) >= 1)) {
				filmes[i+1] = filmes[i];
				i = i-1;
			}
			
			filmes[i+1] = key;
		}
	}
	
	public void mergeSort(Filme[] filmes) {
		int n = filmes.length;
		if(n==1) {
			return;
		} 
		
		int meio = n/2;
		Filme[] left = new Filme[meio];
		Filme[] right = new Filme[n- meio];
		
		for(int i=0; i<meio; i++) {
			left[i] = filmes[i];
		}
		
		for(int i=meio; i<n; i++) {
			right[i - meio] = filmes[i];
		}
		
		mergeSort(left);
		mergeSort(right);
		
		mergeTwoSortedLists(filmes, left, right);
		
	}
	
	public void mergeTwoSortedLists(Filme[] filmes, Filme[] left, Filme[] right) {
		int leftSize = left.length;
		int rightSize = right.length;
		
		int i=0, j=0, k=0;
		
		while(i<leftSize && j < rightSize ) {
			
			if(left[i].compareTo(right[j]) <= -1) {
				filmes[k] = left[i];
				i++;
			}
			else {
				filmes[k] = right[j];
				j++;
			}
			
			k++;
		}
		
		while(i<leftSize) {
			filmes[k] = left[i];
			i++;
			k++;
		}
		
		while(j<rightSize) {
			filmes[k] = right[j];
			j++;
			k++;
		}
		
		
		
	}

	
	public void swap(Filme A[], int i, int j) {
		Filme temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	
	public int partition(Filme A[], int left, int right) {
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
	
	public void AUXquickSort(Filme A[], int left, int right) {
		if(left < right) {
			int pivot = partition(A, left, right);
			AUXquickSort(A, left, pivot-1);
			AUXquickSort(A, pivot+1, right);
		}
	}
	

	@Override
	public void quickSort(Filme A[]) {
		if (A == null || A.length == 0) {
			return;
		}
		AUXquickSort(A, 0, A.length - 1);
	}


	@Override
	public void quickSortRandom(Filme[] filmes) {
		embaralhar(filmes);
		quickSort(filmes);
		
	}
	
	@Override
	public void countingSort(Filme[] filmes) {
		int[] count = new int[5];
		Filme[] sortedFilmes = new Filme[filmes.length];
	    for (int i = 0; i < filmes.length; i++) {
	        count[filmes[i].getNota() - 1]++;
		    }
	    for (int i = count.length - 2; i >= 0; i--) {
	        count[i] += count[i + 1];
	    }
	    for (int i = filmes.length - 1; i >= 0; i--) {
	        sortedFilmes[count[filmes[i].getNota() - 1] - 1] = filmes[i];
	        count[filmes[i].getNota() - 1]--;
	    }
	     for (int i = 0; i < filmes.length; i++) {
			        filmes[i] = sortedFilmes[i];
	    }
	}


	@Override
	public void bubbleSort(Filme[] filmes) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void selectionSort(Filme[] filmes) {
		// TODO Auto-generated method stub
		
	}
	
}

