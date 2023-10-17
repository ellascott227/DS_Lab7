import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueTest {
	String A;
	String B;
	String C;
	Queue<String> Q = new Queue<String>(); 
	
	@BeforeEach
	void setUp() throws Exception {
		A = "a";
		B = "b";
		C = "c";
	}

	@Test
	void testQueue() {
		assertTrue(Q.isEmpty());
		assertThrows(QueueUnderFlowException.class, ()-> {
			Q.pop();
		});
		Q.push(A);
		assertEquals(A, Q.pop());
		Q.push(B);
		Q.push(C);
		assertFalse(Q.isEmpty());
		assertEquals(B, Q.pop());
		assertEquals(C, Q.pop());
		assertThrows(QueueUnderFlowException.class, ()-> {
			Q.pop();
		});
		assertTrue(Q.isEmpty());
	}

}
