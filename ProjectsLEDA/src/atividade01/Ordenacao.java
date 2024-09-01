package atividade01;
import java.util.Random;;

public class Ordenacao implements Ordenacao_IF{
	
	@Override
	public boolean checaVetorOrdenado(Filme[] filmes) {
		// TODO Auto-generated method stub
		return false;
	}

	
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
			while(j>0 && filmes[j].compareTo(menor) ) {
				filmes[j] = filmes[j+1];
				j--;
			}
			menor = filmes[j+1];
		}
	}
	
	public void mergeSort(Filme[] filmes) {
		
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
	
	public void quickSort(Filme A[], int left, int right) {
		if(left < right) {
			int pivot = partition(A, left, right);
			quickSort(A, left, pivot-1);
			quickSort(A, pivot+1, right);
		}
	}
	
	public void quickSortRandom(Filme A[], int left, int right) {
		embaralhar(A);
		if(left < right) {
			int pivot = partition(A, left, right);
			quickSort(A, left, pivot-1);
			quickSort(A, pivot+1, right);
		}
	}

	@Override
	public void quickSort(Filme[] filmes) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void quickSortRandom(Filme[] filmes) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void countingSort(Filme[] filmes) {
		int[] count = new int[5];
        Filme[] sortedFilmes = new Filme[filmes.length];

        for (int i = 0; i < filmes.length; i++) {
            count[filmes[i].getNota() - 1]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = filmes.length - 1; i >= 0; i--) {
            sortedFilmes[count[filmes[i].getNota() - 1] - 1] = filmes[i];
            count[filmes[i].getNota() - 1]--;
        }
        for (int i = 0; i < filmes.length; i++) {
            filmes[i] = sortedFilmes[i];
        }
    }
