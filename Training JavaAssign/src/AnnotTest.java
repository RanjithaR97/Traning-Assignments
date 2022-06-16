import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
	int a();
	
}

class Hello{
	
	@Test (a=10)
	public void sayHello() {
		System.out.println("say hello");		
		
	}
	
}


public class AnnotTest {

	public static void main(String[] args) throws NoSuchMethodException{
		Hello h=new Hello();
		Method m=h.getClass().getMethod("sayHello");
		Test t=m.getAnnotation(Test.class);
		System.out.println("a is:"+t.a()); 
		
		

	}

}
