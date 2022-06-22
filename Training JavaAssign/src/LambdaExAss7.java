import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class LambdaExAss7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		
		String res=map.entrySet()
				.stream().map(entry->entry.getKey()+ "-"+entry.getValue()).collect(Collectors.joining(","));
		System.out.println(res);
	}

}
