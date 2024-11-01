package atividade02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AVL_Test {
	
	private final AVL avl = new AVL();
	
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
	public void testInserir() {
		avl.insert(filmes[0]);
		avl.insert(filmes[1]);
		avl.insert(filmes[2]);
		avl.insert(filmes[3]);
		
		assertFalse(avl.isEmpty());
		
	}
	
	@Test
	public void testRemoverFilmeId10() throws Exception {
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
		
		Filme_IF removido = avl.remove(10);
		
		assertNotEquals(filmes[0], removido);
		assertEquals(filmes[9], removido); 
		
	}
	
	@Test
	public void testRemoverFilmeId9() throws Exception {
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
		
		Filme_IF removido = avl.remove(9);
		
		assertNotEquals(filmes[9], removido);
		assertEquals(filmes[8], removido); 
		
	}
	
	@Test
	public void testRemoverFilmeId8() throws Exception {
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
		
		Filme_IF removido = avl.remove(8);
		
		assertNotEquals(filmes[8], removido);
		assertEquals(filmes[3], removido); 
		
	}
	
	@Test
	public void testRemoverFilmeId7() throws Exception {
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
		
		Filme_IF removido = avl.remove(7);
		
		assertNotEquals(filmes[4], removido);
		assertEquals(filmes[7], removido); 
		
	}
	
	@Test
	public void testRemoverFilmeId6() throws Exception {
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
		
		Filme_IF removido = avl.remove(6);
		
		assertNotEquals(filmes[6], removido);
		assertEquals(filmes[5], removido); 
		
	}
	
	@Test
	public void testRemoverFilmeId5() throws Exception {
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
		
		Filme_IF removido = avl.remove(5);
		
		assertNotEquals(filmes[5], removido);
		assertEquals(filmes[2], removido); 
		
	}
	
	@Test
	public void testRemoverFilmeId4() throws Exception {
		avl.insert(filmes[0]); // id = 1
		avl.insert(filmes[1]); // id = 3
		avl.insert(filmes[2]); // id = 5
		avl.insert(filmes[3]); // id = 8
		avl.insert(filmes[4]); // id = 2
		avl.insert(filmes[5]); // id = 6
		avl.insert(filmes[6]); // id = 4
		
		Filme_IF removido = avl.remove(4);
		
		assertNotEquals(filmes[4], removido);
		assertEquals(filmes[6], removido); 
		
	}
	
	@Test
	public void testRemoverFilmeId3() throws Exception {
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
		
		Filme_IF removido = avl.remove(3);
		
		assertNotEquals(filmes[3], removido);
		assertEquals(filmes[1], removido); 
		
	}
	
	@Test
	public void testRemoverFilmeId2() throws Exception {
		avl.insert(filmes[2]); // id = 5
		avl.insert(filmes[4]); // id = 2
		avl.insert(filmes[5]); // id = 6
		avl.insert(filmes[6]); // id = 4
		avl.insert(filmes[7]); // id = 7
		
		Filme_IF removido = avl.remove(2);
		
		assertNotEquals(filmes[2], removido);
		assertEquals(filmes[4], removido);
		
	}
	
	
	@Test
	public void testRemoverFilmeId1() throws Exception {
		avl.insert(filmes[0]); // id = 1
		avl.insert(filmes[1]); // id = 3
		avl.insert(filmes[2]); // id = 5
		avl.insert(filmes[3]); // id = 8
		
		Filme_IF removido = avl.remove(1);
		
		assertNotEquals(filmes[1], removido);
		assertEquals(filmes[0], removido); 
		
	}
	
	@Test (expected = Exception.class)
	public void testRemoverListaVazia() throws Exception{
		avl.remove(5);	
	}
	
	
	@Test (expected = Exception.class)
	public void testRemoverItemInexistente() throws Exception{
		avl.insert(filmes[0]); // id = 1
		avl.insert(filmes[1]); // id = 3
		avl.insert(filmes[2]); // id = 5
		avl.insert(filmes[3]); // id = 8
		avl.remove(2);	
	}
	
	
	@Test
	public void testBusca() throws Exception {
		avl.insert(filmes[0]); // id = 1
		avl.insert(filmes[1]); // id = 3
		avl.insert(filmes[2]); // id = 5
		avl.insert(filmes[3]); // id = 8
		
		assertEquals(avl.search(filmes[1].getID()), filmes[1]);
		
	}
	
	@Test (expected = Exception.class)
	public void testBuscaListaVazia() throws Exception{
		avl.search(filmes[0].getID());
		
	}
	
	@Test (expected = Exception.class)
	public void testBuscaItemInexistente() throws Exception{
		avl.insert(filmes[0]);
		avl.insert(filmes[1]);
		avl.insert(filmes[2]);
		avl.insert(filmes[3]);
		
		avl.search(filmes[5].getID());
		
	}
	
	@Test
	public void testPreOrdem() {
		avl.insert(filmes[0]); // id = 1
		avl.insert(filmes[4]); // id = 2
		avl.insert(filmes[1]); // id = 3
		avl.insert(filmes[6]); // id = 4
		avl.insert(filmes[2]); // id = 5
		avl.insert(filmes[5]); // id = 6
		avl.insert(filmes[7]); // id = 7
		avl.insert(filmes[3]); // id = 8
		avl.insert(filmes[8]); // id = 9
		avl.insert(filmes[9]); // id = 10
		
		String esperado = "4 2 1 3 8 6 5 7 9 10 ";
		String tem = "";
		Filme_IF[] avlArray = avl.preOrder();
		for(int i=0; i<10; i++) {
			tem += avlArray[i].getID() + " ";
		}
		
		assertEquals(esperado, tem);
		
	}
	
	@Test
	public void testOrdem() {
		avl.insert(filmes[0]); // id = 1
		avl.insert(filmes[4]); // id = 2
		avl.insert(filmes[1]); // id = 3
		avl.insert(filmes[6]); // id = 4
		avl.insert(filmes[2]); // id = 5
		avl.insert(filmes[5]); // id = 6
		avl.insert(filmes[7]); // id = 7
		avl.insert(filmes[3]); // id = 8
		avl.insert(filmes[8]); // id = 9
		avl.insert(filmes[9]); // id = 10
		
		String esperado = "1 2 3 4 5 6 7 8 9 10 ";
		String tem = "";
		Filme_IF[] avlArray = avl.order();
		for(int i=0; i<10; i++) {
			tem += avlArray[i].getID() + " ";
		}
		
		assertEquals(esperado, tem);
		
	}
	
	@Test
	public void testPosOrdem() {
		avl.insert(filmes[0]); // id = 1
		avl.insert(filmes[4]); // id = 2
		avl.insert(filmes[1]); // id = 3
		avl.insert(filmes[6]); // id = 4
		avl.insert(filmes[2]); // id = 5
		avl.insert(filmes[5]); // id = 6
		avl.insert(filmes[7]); // id = 7
		avl.insert(filmes[3]); // id = 8
		avl.insert(filmes[8]); // id = 9
		avl.insert(filmes[9]); // id = 10
		
		String esperado = "1 3 2 5 7 6 10 9 8 4 ";
		String tem = "";
		Filme_IF[] avlArray = avl.postOrder();
		for(int i=0; i<10; i++) {
			tem += avlArray[i].getID() + " ";
		}
		
		assertEquals(esperado, tem);
		
	}
	
	
	
	
}
