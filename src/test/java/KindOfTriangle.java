package t3;
import static org.junit.Assert.*;

import org.junit.Test;

public class KindOfTriangle {
	triangle T = new triangle();
	
	@Test
	public void test1() throws Exception {
		assertEquals("正三角形", T.check(1, 1, 1));
	}
	
	@Test
	public void test2() throws Exception {
		assertEquals("等腰三角形", T.check(2, 3, 2));
		assertEquals("等腰三角形", T.check(2, 2, 3));
		assertEquals("等腰三角形", T.check(3, 2, 2));
		assertEquals("等腰三角形", T.check(3, 3, 2));
	}
	
	@Test
	public void test3() throws Exception {
		assertEquals("直角三角形", T.check(2, 1, 1.732));
	}
	
	@Test
	public void test4() throws Exception {
		assertEquals("三角形", T.check(3, 4, 2));
	}
	
	@Test
	public void test5() throws Exception {
		assertEquals("直角三角形", T.check(4, 3, 5));
	}
	
	@Test(expected = Exception.class)
	public void test6() throws Exception {
		T.check(0, 1, 1);
		T.check(1, 0, 1);
		T.check(1, 1, 0);
		T.check(0, 0, 1);
		T.check(0, 1, 0);
		T.check(1, 0, 0);
		T.check(0, 0, 0);
		T.check(1, 1, 1);
	}
}
