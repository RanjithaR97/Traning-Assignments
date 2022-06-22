import java.util.ArrayList;
import java.util.function.UnaryOperator;

class Op implements UnaryOperator<String>{
	public String apply(String str) {
		return str.toUpperCase();
		
	}
}
public class LambdaAss6 {

	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<>();
	list.add("Java");
	list.add("javascript");
	list.add("CoffeeScript");
	System.out.println(list);
	list.replaceAll(new Op());
	System.out.println(list);
	

	}

}
