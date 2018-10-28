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
	
	/**
	 * d4 = < { Queue() -> enqueue(1) -> dequeue() -> size() } , { size() == 0 } >
	 */
	@Test
	void transformateurs_first_sequence_1() {
		Queue<Integer> q = new Queue<Integer>();
		assertEquals(q.size(), 0);
		q.enqueue(1);
		assertEquals(q.size(), 1);
		q.dequeue();
		assertEquals(q.size(), 0);
	}
	
	/**
	 * d5 = < { Queue() -> dequeue(1) -> enqueue() -> size() } , { Error Queue underflow } >
	 */
	@Test
	void transformateurs_first_sequence_2() {
		Queue<Integer> q = new Queue<Integer>();
		assertThrows(NoSuchElementException.class, () -> {
			q.dequeue();
		}, "Devrait retourner une erreur indiquant qu'il n'y a pas assez d'element pour faire un peek.");
		q.enqueue(1);
		int resultat = q.peek();
		assertEquals(resultat, 1);
	}
	
	
}
