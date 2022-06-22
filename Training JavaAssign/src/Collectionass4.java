import java.util.Date;
import java.util.LinkedList;

public class Collectionass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList <Date> l1=new LinkedList<>();
     l1.add(new Date(20-10-2020));
    
     if(l1.equals(20-10-2020)) {
    	 System.out.println(l1+" " +"leap year");
     }else {
    	 System.out.println("not leap year");
     }
     System.out.println(l1);
	}

}
