package atividade02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class Filme_Test {
	
	@Test
	public void testCompareTo() {
		Filme_IF f1 = new Filme("A", 2020, 5,  1);
        Filme_IF f2 = new Filme("B", 2020, 5,  3);
        Filme_IF f3 = new Filme("C", 2019, 4,  5);
        Filme_IF f4 = new Filme("D", 2000, 4,  8);
        Filme_IF f5 = new Filme("E", 2005, 3,  2);
        Filme_IF f6 = new Filme("F", 2002, 3,  6);
        Filme_IF f7 = new Filme("G", 2005, 3,  4);
        Filme_IF f8 = new Filme("H", 2019, 2,  7);
        Filme_IF f9 = new Filme("I", 2020, 2,  9);
        Filme_IF f10 = new Filme("J", 1998, 1,  10);
	    
        
        assertTrue(f1.compareTo(f2) < 0);
        assertTrue(f2.compareTo(f1) > 0);
        assertTrue(f5.compareTo(f6) < 0);
        assertTrue(f6.compareTo(f5) > 0);
        assertTrue(f3.compareTo(f9) < 0);
        assertTrue(f9.compareTo(f3) > 0);
        assertTrue(f7.compareTo(f4) < 0);
        assertTrue(f4.compareTo(f7) > 0);
        
        assertEquals(0, f10.compareTo(f10));
        assertEquals(0, f8.compareTo(f8));
        
	}
	

	@Test
	public void testToString() {
		 Filme_IF f = new Filme("Nemo", 2003, 5, 1);
		 assertEquals("Nemo (2003) [5] ID: 1", f.toString());
	}
	
	@Test
	public void testSettersAndGetters() {
        Filme_IF f = new Filme("Nemo", 2003, 5, 1);
        f.setNome("Dory");
        f.setAno(2016);
        f.setNota(4);
        f.setID(2);

        assertEquals("Dory", f.getNome());
        assertEquals(2016, f.getAno());
        assertEquals(4, f.getNota());
        assertEquals(2, f.getID());
        
    }
	
	
}
