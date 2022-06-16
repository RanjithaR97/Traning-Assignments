import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@interface Execute{
	int a() ;
	int Sequence();

	
	
}

class Hello1{
   
	@Execute(a=10,Sequence=2)
	public void m1() {
		System.out.println("hi");
	}
	@Execute(a=20,Sequence=1)
	public void m2() {
		System.out.println("hi");
	}
	@Execute(a=30,Sequence=3)
	public void m3() {
		System.out.println("hi");
		
	}
}
public class SequenceAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello1 h=new Hello1();
		Method[] m=h.getClass().getDeclaredMethods();
		

	}

}
