import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Contact {
	 long phoneNo;
	 String name;
	 String email;
	 String gender;
	public Contact(long phoneNo, String name, String email, String gender) {
		super();
		this.phoneNo = phoneNo;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Contact [phoneNo=" + phoneNo + ", name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
		
}
class PhoneNo implements Comparator<Contact>{

	@Override
	public int compare(Contact o1, Contact o2) {
		// TODO Auto-generated method stub
		if(o1.phoneNo == o2.phoneNo) {
			return 0;
		}
		else if(o1.phoneNo<o2.phoneNo) {
			return 1;
		}else {
			return -1;
		}
	}
	
}

public class Collectionass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Long,Contact> t1=new TreeMap<>();
		t1.put((long) 1000178904,new Contact(989276829,"Ranjitha","ranji@gmail.com","female"));
		t1.put((long) 1000178777,new Contact(98928759,"Pooja","pooja@gmail.com","female"));
		t1.put((long) 1000176434,new Contact(989274329,"Poorni","Poorni@gmail.com","female"));
		t1.put((long) 1000173214,new Contact(989206829,"Ram","ram@gmail.com","male"));
		t1.put((long) 100018904,new Contact(989446829,"Revathi","reva@gmail.com","female"));
		System.out.println(t1);
		Set<Map.Entry<Long,Contact>> entrySet=t1.entrySet();
		for(Map.Entry<Long, Contact>entry: entrySet)
		{
			System.out.println(entry.getKey());
			
			
		}
		for(Map.Entry<Long, Contact>entry: entrySet)
		{
			System.out.println(entry.getValue());
			
			
		}
		for(Map.Entry<Long, Contact>entry: entrySet)
		{
			System.out.println(entry.getKey()+"  "+entry.getValue());
			
			
		}

	}

}
