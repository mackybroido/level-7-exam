import static org.junit.Assert.*;

import org.junit.Test;


public class BestRestaurantVoteCounterTest {

	@Test
	public void test() {
		BestRestaurantVoteCounter bestResterauntVoteCounter = new BestRestaurantVoteCounter();
		assertEquals("C Level", bestResterauntVoteCounter.getWinner());
	}

}
