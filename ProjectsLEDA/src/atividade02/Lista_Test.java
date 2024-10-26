package atividade02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class Lista_Test {
private final Lista_IF lista = new Lista();
	
	private Filme_IF[] filmes = {
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
    
	@Test
	public void testInserir() throws Exception {
		
		lista.insert(filmes[0]);
		assertEquals(filmes[0], lista.head());
		assertNotEquals(filmes[1], lista.head());
		
		lista.insert(filmes[1]);
		assertEquals(filmes[1], lista.head());
		assertNotEquals(filmes[0], lista.head());
		
	}
	
	
	@Test
	public void testRemover() throws Exception {
		lista.insert(filmes[0]);
		lista.insert(filmes[1]);
		Filme_IF removido = lista.remove(3);
		assertNotEquals(filmes[0], removido);
		assertEquals(filmes[1], removido);
		
		
	}
	
	
	@Test(expected = Exception.class)
	public void testRemoverExcecao() throws Exception {
		Filme_IF removido1 = lista.remove(5);
		
	}
	
	
}
