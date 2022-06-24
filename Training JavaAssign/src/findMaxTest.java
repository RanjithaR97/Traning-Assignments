package TestingAss;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class findMaxTest {

	@Test
	void test() {
		findMinmax2 f=new findMinmax2();
		int [] res=f.findMaxMin(new int[]{1,4,5,7});
		int[] expected= {7};
		Assert.assertArrayEquals(expected,res);
	}
	@Test
	void test1() {
		findMinmax2 f=new findMinmax2();
		int [] res=f.findMaxMin(new int[]{1,4,5,7});
		int[] expected= {1};
		Assert.assertArrayEquals(expected,res);
	}

}
