package atividade02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class Fila_Test {
	
	private final Fila_IF fila = new Fila();
	
	private Filme_IF[] filmes = {
			new Filme("A", 2020, 5,  1),
			new Filme("B", 2020, 5,  3),
		    new Filme("C", 2019, 4,  5),
		    new Filme("D", 2000, 4,  8),
		    new Filme("E", 2005, 3,  2),
		    new Filme("F", 2002, 3,  6),
		    new Filme("G", 2005, 3,  4),
		    new Filme("H", 2019, 2,  7),
		    new Filme("I", 2020, 2,  9),
		    new Filme("J", 1998, 1,  10)
	};
    
	@Test
	public void testInserir() throws Exception {
		fila.enqueue(filmes[0]);
		assertEquals(filmes[0], fila.head());
		assertNotEquals(filmes[1], fila.head());
		
		fila.enqueue(filmes[1]);
		assertEquals(filmes[1], fila.head());
		assertNotEquals(filmes[0], fila.head());
		
	}
	
	
	@Test
	public void testRemover() throws Exception {
		fila.enqueue(filmes[0]);
		fila.enqueue(filmes[1]);
		
		assertEquals(filmes[0], fila.dequeue());
		
		
	}
	
	
	@Test(expected = Exception.class)
	public void testRemoverExcecao() throws Exception {
		fila.dequeue();
	}
	
	
	
	
	
}
