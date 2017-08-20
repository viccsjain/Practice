package JPMorgan;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMessageUtil {

	String smg = "Hi Vikram";
	MessageUtil util = new MessageUtil(smg);

	@Test
	public void test() {
		smg = "hihi";
		assertEquals(smg, util.printMe());
	}

}
