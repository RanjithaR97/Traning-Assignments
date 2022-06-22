
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

class strore_unique_q2  
{
	
	int id;
	String  item;
	strore_unique_q2 (int id,String item)
	{
		this.item=item;
		this.id=id;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, item);
	}
	
	@Override
	public String toString() {
		return "[item=" + item + "]" +"\n "+"[id=" + id + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		strore_unique_q2 other = (strore_unique_q2) obj;
		return id == other.id && Objects.equals(item, other.item);
	}
}
class CollectionAss2
{

	public static void main(String args[])
	{
		HashSet<strore_unique_q2 > h=new HashSet<>();
		strore_unique_q2 store=new strore_unique_q2 (10,"lap");
		strore_unique_q2 store1=new strore_unique_q2 (1,"mobile");
		strore_unique_q2 store2=new strore_unique_q2 (10,"lap");
		strore_unique_q2 store3=new strore_unique_q2 (10,"bag");
		strore_unique_q2 store4=new strore_unique_q2 (2,"mobile");
		strore_unique_q2 store5=new strore_unique_q2 (0,"pen");
		 h.add(store);
		 h.add(store1);
		 h.add(store2);
		 h.add(store3);
		 h.add(store4);
		 h.add(store5);			


	

	   
	   for(	strore_unique_q2 i:h)
	   {
		System.out.println(i);
	   }
}










	
	
}