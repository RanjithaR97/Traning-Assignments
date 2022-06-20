
public class SingletonClass {

	public static void main(String[] args) {
		Abc obj1=Abc.getInstance();
		Abc obj2=Abc.getInstance();
		Abc obj3=Abc.getInstance();
	}

	static class Abc{
	static	 Abc obj=new Abc();
		 
		 private Abc() {
			 System.out.println("Hiii");
			 
		 }
		  static Abc getInstance() {
			 return obj;
		 }
	}
 
}
