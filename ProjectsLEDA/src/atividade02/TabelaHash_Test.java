package atividade02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TabelaHash_Test {

	TabelaHash tab = new TabelaHash();
	
	private Filme_IF[] filmes = {
			new Filme("A", 2020, 5,  1),
			new Filme("B", 2020, 5,  3),
		    new Filme("C", 2019, 4,  5),
		    new Filme("D", 2000, 4,  8),
		    new Filme("E", 2005, 3,  13),
		    new Filme("F", 2002, 3,  26),
		    new Filme("G", 2005, 3,  39),
		    new Filme("H", 2019, 2,  7),
		    new Filme("I", 2020, 2,  9),
		    new Filme("J", 1998, 1,  10)
	};
	
	
	@Test
	public void testInserirRetornaFalse() throws Exception {
		tab.insert(filmes[0]);
		assertFalse(tab.isEmpty());
	}
	
	
	@Test
	public void testInserirRetornaTrue() throws Exception {
		assertTrue(tab.isEmpty()); 
	}
	
	
	@Test 
	public void testRemover() throws Exception {
		tab.insert(filmes[0]); // id = 1
		tab.insert(filmes[1]); // id = 2
		tab.insert(filmes[2]); // id = 5
		tab.insert(filmes[3]); // id = 8
		tab.insert(filmes[4]); // id = 13
		tab.insert(filmes[5]); // id = 26
		
		assertEquals(filmes[5], tab.remove(filmes[5].getID()));
		
	}
	
	
	@Test (expected = Exception.class)
	public void testRemoverListaVaziaException() throws Exception {
		tab.remove(filmes[0].getID());
	}
	
	@Test (expected = Exception.class)
	public void testRemoverElementoNaoExistenteException() throws Exception {
		tab.insert(filmes[0]); 
		tab.insert(filmes[1]); 
		tab.insert(filmes[2]); 
		
		tab.remove(filmes[6].getID());
	}
	
	@Test 
	public void testBusca() throws Exception {
		tab.insert(filmes[0]); // id = 1
		tab.insert(filmes[1]); // id = 2
		tab.insert(filmes[2]); // id = 5
		tab.insert(filmes[3]); // id = 8
		tab.insert(filmes[4]); // id = 13
		tab.insert(filmes[5]); // id = 26
		
		assertEquals(filmes[4], tab.search(filmes[4].getID()));
	}
	
	@Test (expected = Exception.class)
	public void testBuscaElementoNaoExistenteException() throws Exception {
		tab.insert(filmes[0]); // id = 1
		tab.insert(filmes[1]); // id = 2
		tab.insert(filmes[2]); // id = 5
		tab.insert(filmes[3]); // id = 8
		tab.insert(filmes[4]); // id = 13
		tab.insert(filmes[5]); // id = 26
		
		tab.search(filmes[6].getID());
	}
	
	@Test (expected = Exception.class)
	public void testBuscaListaVaziaException() throws Exception {
		tab.search(filmes[6].getID());
	}
	
	@Test 
	public void testOrdenar() throws Exception {
		tab.insert(filmes[6]); // id = 39
		tab.insert(filmes[5]); // id = 26
		tab.insert(filmes[4]); // id = 13
		
		tab.ordenar();
		
		assertEquals(filmes[4], tab.getT()[0].getFim().getValor());
		
		
		
	}
	
	
}




