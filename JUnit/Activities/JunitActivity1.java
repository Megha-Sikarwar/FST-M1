package tes.java;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JunitActivity1 {
	static List<String> list = new ArrayList <String>();
	@BeforeAll
	public static void setup() throws Exception {
		list.add("alpha");
		list.add("beta");
	}
	@Test
	public void insertTest() {
		assertEquals(2, list.size(), "Actual and expected value matches");
		list.add(2, "charlie");
        assertEquals(3, list.size(), "Actual and expected value matches");
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("beta", list.get(1), "Wrong element");
        assertEquals("charlie", list.get(2), "Wrong element");
	}
	@Test
	public void replaceTest() {
		 list.add(2,"Jacky");
		 list.set(2, "charlie");
	     assertEquals(3, list.size(), "Wrong size");
	     assertEquals("alpha", list.get(0), "Wrong element");
	     assertEquals("beta", list.get(1), "Wrong element");
	}
}
