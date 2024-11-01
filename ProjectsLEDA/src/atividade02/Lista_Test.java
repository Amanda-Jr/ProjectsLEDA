package atividade02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Lista_Test {
	private final Lista lista = new Lista();
	
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
	
	@Test
	public void testBusca() throws Exception {
		lista.insert(filmes[2]);
		lista.insert(filmes[3]);
		lista.insert(filmes[4]);
		lista.insert(filmes[5]);
		lista.insert(filmes[0]);
		lista.insert(filmes[1]);
		
		assertEquals(filmes[3], lista.search(8)); // id filmes[3] == 8 
		assertNotEquals(filmes[3], lista.search(3));
		
	}
	
	
	@Test(expected = Exception.class)
	public void testBuscaExcecao() throws Exception {
		
		lista.insert(filmes[0]); // id = 1
		lista.insert(filmes[1]); // id = 3
		lista.insert(filmes[2]); // id = 5
		lista.insert(filmes[3]); // id = 8
		lista.insert(filmes[4]); // id = 2
		lista.insert(filmes[5]); // id = 6
		
		lista.search(4);

	}
	
	@Test
	public void testReturnHead() throws Exception {
		lista.insert(filmes[0]); // id = 1
		lista.insert(filmes[1]); // id = 3
		lista.insert(filmes[2]); // id = 5
		lista.insert(filmes[3]); // id = 8
		lista.insert(filmes[4]); // id = 2
		lista.insert(filmes[5]); // id = 6
		
		assertEquals(filmes[5], lista.head());
		
	}
	
	@Test
	public void testReturnTail() throws Exception {
		lista.insert(filmes[0]); // id = 1
		lista.insert(filmes[1]); // id = 3
		lista.insert(filmes[2]); // id = 5
		lista.insert(filmes[3]); // id = 8
		lista.insert(filmes[4]); // id = 2
		lista.insert(filmes[5]); // id = 6
		
		assertEquals(filmes[0], lista.tail());
		
	}
	
	@Test
	public void testInicioIsNill() throws Exception {
		assertTrue(lista.getIni().isNil());
	}
	
	@Test
	public void testFimIsNill() throws Exception {
		assertTrue(lista.getFim().isNil());
	}
	
	
	@Test(expected = Exception.class)
	public void testInicioIsNillExcecao() throws Exception {
		lista.head();

	}
	
	@Test(expected = Exception.class)
	public void testFimIsNillExcecao() throws Exception {
		lista.tail();

	}
	
	@Test 
	public void testImprimir() {
		lista.insert(filmes[0]); // id = 1
		String print =  lista.print(lista.getFim());
		assertEquals("A (2020) [5] ID: 1\n", print);
	}
	
	@Test 
	public void testOrdenar() {
		lista.insert(filmes[1]); // id = 3
		lista.insert(filmes[2]); // id = 5
		lista.insert(filmes[3]); // id = 8
		lista.insert(filmes[0]); // id = 1
		
		lista.ordernar();
		assertEquals(lista.getIni().getValor(), filmes[0]);
		
	}
	
	
	
}

