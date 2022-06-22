import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
class Person{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class LambdaExpAss3 {

	public static void main(String[] args) {
		//Prdeicate boolean result
		Predicate<String> strlen=str->str.length()>5;
		System.out.println(strlen.test("Ranjitha"));
		
		//Consumer takes input no res and modify
		Person p=new Person();
		Consumer<Person> setName=t->t.setName("Play safe");
		setName.accept(p);
        System.out.println(p.getName());
        
        //Function both input nd output
        Function<Integer,String> f=t->t*10+ " multiplied by 10";
        System.out.println(f.apply(2));
		
        //Supplier only output not take arguments
        
        Supplier<Double> getDouble=()->Math.random();
        System.out.println(getDouble.get());
		
		

	}

}
