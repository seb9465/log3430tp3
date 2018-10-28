package TP3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Queue;
import java.util.NoSuchElementException;

class TP3 {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * d1 = < { Queue() -> size() }, { size() == 0 } >
	 */
	@Test
	void rapporteur_n() {
		Queue q = new Queue();
		assertEquals(q.size(), 0);
	}
	
	/**
	 * d2 = < { Queue() -> peek() } , { peek() == Error Queue underflow } >
	 */
	@Test
	void rapporteur_first_vide() {
		Queue q = new Queue();
		assertThrows(NoSuchElementException.class, () -> {
			q.peek();
		}, "Devrait retourner une erreur indiquant qu'il n'y a pas assez d'element pour faire un peek.");
	}
	
	/**
	 * d3 = < { Queue() -> enqueue(1) -> peek() } , { peek() == 1 } >
	 */
	@Test
	void rapporteur_first_nonVide() {
		Queue<Integer> q = new Queue<Integer>();
		int val = 1;
		q.enqueue(val);
		int result = q.peek();
		assertEquals(result, val);
	}
}
