package TP3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Queue;

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
	
}
