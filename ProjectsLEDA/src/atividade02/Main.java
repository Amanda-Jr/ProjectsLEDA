package atividade02;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Filme f1 = new Filme("Tarzan", 2004, 5, 3);
		Filme f2 = new Filme("Tom e Jerry", 2022, 2, 55);
		Filme f3 = new Filme("Ben 10", 2001, 1, 26);
		
		TabelaHash t = new TabelaHash();
		
		//System.out.println(t.isEmpty());
		
		t.insert(f1);
		t.insert(f2);
		t.insert(f3);
		
		//System.out.println(t.isEmpty());
		
		System.out.println(t.print());
		
		t.remove(55);
		
		System.out.println(t.print());
		
		//System.out.println(t.search(55));
		//System.out.println(t.search(3));
		//System.out.println(t.search(45));
	}

}
