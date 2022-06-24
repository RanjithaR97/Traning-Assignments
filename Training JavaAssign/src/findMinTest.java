package TestingAss;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class findMinTest {

	@Test
	void test() {
		findMinmax3 f= new findMinmax3();
		int res[]=f.findMaxMin(new int[] {1,2,7,8});
		int expected[]= {1};
		Assert.assertArrayEquals(expected, res);
		
	}
	@Test
	void test1() {
		findMinmax3 f= new findMinmax3();
		int res[]=f.findMaxMin(new int[] {1,2,7,8});
		int expected[]= {8};
		Assert.assertArrayEquals("max value is given",expected, res);
		
	}

}
