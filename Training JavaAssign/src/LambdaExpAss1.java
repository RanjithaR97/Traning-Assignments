@FunctionalInterface
interface  Arithmetic{
	int operations(int a,int b);
}
public class LambdaExpAss1 {

	public static void main(String[] args) {
		//Addition of numbers
		Arithmetic add=(a,b)-> a+b;
		System.out.println("Addition of Numbers is => " + add.operations(10, 20));
	
		//Subtraction of numbers
        Arithmetic sub=(a,b)->a-b;
        System.out.println("Subtraction of Numbers is => " + sub.operations(10, 20));
        
        //multipication of numbers
        Arithmetic mul=(a,b)->a*b;
        System.out.println("Multiplication of Numbers is => " + mul.operations(10, 20));
        
        //division of numbers
        Arithmetic div=(a,b)->a/b;
        System.out.println("Division of Numbers is => " + div.operations(20, 10));
}
}
