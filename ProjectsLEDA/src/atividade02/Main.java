package atividade02;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Filme_IF[] filmes = {
				new Filme("A", 5, 2020, 1),
				new Filme("B", 5, 2020, 3),
			    new Filme("C", 4, 2019, 5),
			    new Filme("D", 4, 2000, 8),
			    new Filme("E", 3, 2005, 2),
			    new Filme("F", 3, 2002, 6),
			    new Filme("G", 3, 2005, 4),
			    new Filme("H", 2, 2019, 7),
			    new Filme("I", 2, 2020, 9),
			    new Filme("J", 1, 1998, 10)
			};
		
		/*
		TabelaHash t = new TabelaHash();
		Lista l = new Lista();
		Pilha p = new Pilha();
		Fila f = new Fila();
		
		System.out.println(t.isEmpty());
		
		t.insert(f1);
		t.insert(f2);
		t.insert(f3);
		t.insert(f4);
		t.insert(f5);
		t.insert(f6);
		
		
		l.insert(f1);
		l.insert(f2);
		l.insert(f3);
		l.insert(f1);
		l.insert(f2);
		l.insert(f3);
		
		p.push(f1);
		p.push(f2);
		
		f.enqueue(f1);
		f.enqueue(f2);
		f.enqueue(f3);
		
		
		
		System.out.println(l.size());
		l.print(l.getFim());
		System.out.println("");
		//p.print();
		System.out.println("");
		//f.print();
		System.out.println("\nlista ordenada");
		l = l.ordernar();
		l.print(l.getFim());
		
		System.out.println(t.isEmpty());
		
		System.out.println(t.print());
		
		t.remove(55);
		
		System.out.println(t.print());
		
		System.out.println("Tabela Hash Ordenada: ");
		t.ordenar();
		System.out.println(t.print());
		*/
		
		//System.out.println(t.search(55));
		//System.out.println(t.search(3));
		//System.out.println(t.search(45));
		
		AVL avl = new AVL();
		System.out.println(avl.isEmpty());
		
		avl.insert(filmes[0]); // id = 1
		avl.insert(filmes[1]); // id = 3
		avl.insert(filmes[2]); // id = 5
		avl.insert(filmes[3]); // id = 8
		avl.insert(filmes[4]); // id = 2
		avl.insert(filmes[5]); // id = 6
		avl.insert(filmes[6]); // id = 4
		avl.insert(filmes[7]); // id = 7
		avl.insert(filmes[8]); // id = 9
		avl.insert(filmes[9]); // id = 10
		
		System.out.println(avl.isEmpty());
		
		Filme_IF filme = avl.remove(11);
		System.out.println(filme);
	}

}
