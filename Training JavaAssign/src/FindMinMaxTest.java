package TestingAss;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FindMinMaxTest {

	@Test
	void test() {
	 findMinMax f=new findMinMax();
	 int[] res=f.findMaxMin(new int[] {56,34,7,3,54,3,34,34,53});
	 int [] expected= {3,56};
	Assert.assertArrayEquals(expected, res);
	}
	@Test
	void testlen() {
	 findMinMax f=new findMinMax();
	 int[] res=f.findMaxMin(new int[] {56,34,7,3,54,3,34,34,53});
	 int [] expected= {56,3};
	Assert.assertArrayEquals("index have different elements",expected,res);
	}
	@Test
	void testNeg() {
	 findMinMax f=new findMinMax();
	 int[] res=f.findMaxMin(new int[] {56,34,7,3,54,3,34,34,53});
	 int [] expected= {-3,56};
	 Assert.assertArrayEquals("index have negative elements", expected,res);
	}
	@Test
	void testmore() {
	 findMinMax f=new findMinMax();
	 int[] res=f.findMaxMin(new int[] {56,34,7,3,54,3,34,34,53});
	 int [] expected= {3,56,3};
	 Assert.assertArrayEquals("more than 2 index are there", expected,res);
	}
	

}
