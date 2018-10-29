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
	void transformateurs_n_sequence_1() {
		Queue<Integer> q = new Queue<Integer>();
		q.enqueue(1);
		q.dequeue();
		assertEquals(q.size(), 0);
	}
	
	/**
	 * d5 = < { Queue() -> dequeue(1) -> enqueue() -> size() } , { Error Queue underflow } >
	 */
	@Test
	void transformateurs_n_sequence_2() {
		Queue<Integer> q = new Queue<Integer>();
		assertThrows(NoSuchElementException.class, () -> {
			q.dequeue();
		}, "Devrait retourner une erreur indiquant qu'il n'y a pas assez d'element pour faire un dequeue.");
		q.enqueue(1);
		int resultat = q.peek();
		assertEquals(resultat, 1);
	}
	
	/**
	 * d6 = < { Queue() -> dequeue() -> size() -> enqueue(1) } , { Error Queue underflow } >
	 */
	@Test
	void transformateurs_n_sequence_3() {
		Queue<Integer> q = new Queue<Integer>();
		assertThrows(NoSuchElementException.class, () -> {
			q.dequeue();
		}, "Devrait retourner une erreur indiquant qu'il n'y a pas assez d'element pour faire un dequeue.");
		assertEquals(q.size(), 0);
		q.enqueue(1);
	}
	
	/**
	 * d7 = < { Queue() -> enqueue (1) -> size() -> dequeue(1) } , { size() == 1 } >
	 */
	@Test
	void transformateurs_n_sequence_4() {
		Queue<Integer> q = new Queue<Integer>();
		q.enqueue(1);
		assertEquals(q.size(), 1);
		q.dequeue();
	}
	
	/**
	 * d8 = < { Queue() -> size() -> enqueue(1)  -> dequeue() } , { size() == 0 } >
	 */
	@Test
	void transformateurs_n_sequence_5() {
		Queue<Integer> q = new Queue<Integer>();
		assertEquals(q.size(), 0);
		q.enqueue(1);
		q.dequeue();
	}
	
	/**
	 * d9 = < { Queue() -> size() -> dequeue()  -> enqueue(1) } , { Error Queue underflow } >
	 */
	@Test
	void transformateurs_n_sequence_6() {
		Queue<Integer> q = new Queue<Integer>();
		assertEquals(q.size(), 0);
		assertThrows(NoSuchElementException.class, () -> {
			q.dequeue();
		}, "Devrait retourner une erreur indiquant qu'il n'y a pas assez d'element pour faire un dequeue.");
		q.enqueue(1);
	}
	
	/**
	 * d10 = < { Queue() -> isEmpty() -> peek() -> enqueue(1) -> dequeue() ) } , { Error Queue underflow } >
	 */
	@Test
	void transformateurs_first_sequence_1() {
		Queue<Integer> q = new Queue<Integer>();
		assertEquals(q.isEmpty(), true);
		assertThrows(NoSuchElementException.class, () -> {
			q.peek();
		}, "Devrait retourner une erreur indiquant qu'il n'y a pas assez d'element pour faire un peek.");
		q.enqueue(1);
		q.dequeue();
	}

	/**
	 * d11 = < { Queue() -> isEmpty() -> enqueue(1) -> peek() -> dequeue() } , { isEmpty = true, peek() == 1 } >
	 */
	@Test
	void transformateurs_first_sequence_2() {
		Queue<Integer> q = new Queue<Integer>();
		assertEquals(q.isEmpty(), true);
		q.enqueue(1);
		int resultat = q.peek();
		assertEquals(resultat, 1);
		q.dequeue();
	}
	
	/**
	 * d12 = < { Queue() -> isEmpty() -> dequeue() -> enqueue(1) -> peek() } , { Error Queue underflow } >
	 */
	@Test
	void transformateurs_first_sequence_3() {
		Queue<Integer> q = new Queue<Integer>();
		assertEquals(q.isEmpty(), true);
		assertThrows(NoSuchElementException.class, () -> {
			q.dequeue();
		}, "Devrait retourner une erreur indiquant qu'il n'y a pas assez d'element pour faire un dequeue.");
		q.enqueue(1);
		int resultat = q.peek();
		assertEquals(resultat, 1);
	}
	
	/**
	 * d13 = < { Queue() -> enqueue(1) -> isEmpty() -> peek() -> dequeue() } , { isEmpty() == false, peek() == 1 } >
	 */
	@Test
	void transformateurs_first_sequence_4() {
		Queue<Integer> q = new Queue<Integer>();
		q.enqueue(1);
		assertEquals(q.isEmpty(), false);
		int resultat = q.peek();
		assertEquals(resultat, 1);
		q.dequeue();
	}
	
	/**
	 * d14 = < { Queue() -> enqueue(1) -> peek() -> isEmpty() -> dequeue() } , { isEmpty() == false, peek() == 1 } >
	 */
	@Test
	void transformateurs_first_sequence_5() {
		Queue<Integer> q = new Queue<Integer>();
		q.enqueue(1);
		int resultat = q.peek();
		assertEquals(resultat, 1);
		assertEquals(q.isEmpty(), false);
		q.dequeue();
	}
	
	/**
	 * d15 = < { Queue() -> enqueue(1) -> peek() -> dequeue() -> isEmpty() } , { isEmpty() == true, peek() == 1 } >
	 */
	@Test
	void transformateurs_first_sequence_6() {
		Queue<Integer> q = new Queue<Integer>();
		q.enqueue(1);
		int resultat = q.peek();
		assertEquals(resultat, 1);
		q.dequeue();
		assertEquals(q.isEmpty(), true);
	}
	
	/**
	 * d16 = < { Queue() -> enqueue(1) -> enqueue(2) -> size() } , { size() == 2 } >
	 */
	
	@Test
	void autres_enqueue_dequeue() {
		Queue<Integer> q = new Queue<Integer>();
		q.enqueue(1);
		q.enqueue(2);
		int taille = q.size();
		assertEquals(taille, 2);
		q.dequeue();
		q.dequeue();
		taille = q.size();
		assertEquals(taille, 0);
	}
}
