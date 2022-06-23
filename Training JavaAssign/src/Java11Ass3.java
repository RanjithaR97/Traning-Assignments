import java.util.ArrayList;
import java.util.Arrays;

public class Java11Ass3 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("A");
		list.add("quick");
		list.add("brown");
		list.add("fox");
		list.add("jumps");
		list.add("over");
		list.add("the");
		list.add("lazy");
		list.add("dog");
		
		String[] list1=list.toArray(String []::new);
		System.out.println(Arrays.toString(list1));

	}

}
