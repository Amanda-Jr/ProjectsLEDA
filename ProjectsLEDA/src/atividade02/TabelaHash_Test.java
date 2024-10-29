package atividade02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TabelaHash_Test {

	TabelaHash tab = new TabelaHash();
	
	private Filme_IF[] filmes = {
			new Filme("A", 5, 2020, 1),
			new Filme("B", 5, 2020, 2),
		    new Filme("C", 4, 2019, 5),
		    new Filme("D", 4, 2000, 8),
		    new Filme("E", 3, 2005, 13),
		    new Filme("F", 3, 2002, 26),
		    new Filme("G", 3, 2005, 14),
		    new Filme("H", 2, 2019, 17),
		    new Filme("I", 2, 2020, 39),
		    new Filme("J", 1, 1998, 91)
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
	
}




