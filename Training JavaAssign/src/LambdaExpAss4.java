import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LambdaExpAss4 {

	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<>(Arrays.asList("ram","ranji","poor","omkar"));
	list.removeIf(str-> str.length() % 2!=0);
	System.out.println(list);
	
}
}