
public class Java11Ass1 {

	public static void main(String[] args) {
		
		FunSI obj= ( var p, var r, var t)->{			
		int SI=p*r*t/100;
		return SI;
	};
	
	System.out.println(obj.operation(1000, 2, 4));
	
}
}
interface FunSI{
	int operation(int p,int r,int t);
}