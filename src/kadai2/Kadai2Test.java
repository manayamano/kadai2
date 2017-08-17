package kadai2;
import static org.junit.Assert.*;

import org.junit.Test;

public class Kadai2Test {

	@Test
	public void testhenkandekimasen() {
		assertTrue(Kadai2.roma(0).equals("変換できません"));
		assertTrue(Kadai2.roma(21).equals("変換できません"));
	}

	@Test
	public void test() {
		assertTrue(Kadai2.roma(1).equals("I"));
		assertTrue(Kadai2.roma(2).equals("II"));
		assertTrue(Kadai2.roma(3).equals("III"));
		assertTrue(Kadai2.roma(4).equals("IV"));
		assertTrue(Kadai2.roma(5).equals("V"));
		assertTrue(Kadai2.roma(6).equals("VI"));
		assertTrue(Kadai2.roma(7).equals("VII"));
		assertTrue(Kadai2.roma(8).equals("VIII"));
		assertTrue(Kadai2.roma(9).equals("IX"));
		assertTrue(Kadai2.roma(10).equals("X"));
		assertTrue(Kadai2.roma(11).equals("XI"));
		assertTrue(Kadai2.roma(12).equals("XII"));
		assertTrue(Kadai2.roma(13).equals("XIII"));
		assertTrue(Kadai2.roma(14).equals("XIV"));
		assertTrue(Kadai2.roma(15).equals("XV"));
		assertTrue(Kadai2.roma(16).equals("XVI"));
		assertTrue(Kadai2.roma(17).equals("XVII"));
		assertTrue(Kadai2.roma(18).equals("XVIII"));
		assertTrue(Kadai2.roma(19).equals("XIX"));
		assertTrue(Kadai2.roma(20).equals("XX"));
	}

}
