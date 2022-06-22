import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Orders{
	int price;
	String status;
	public Orders(int price, String status) {
		super();
		this.price = price;
		this.status = status;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Orders [price=" + price + ", status=" + status + "]";
	}
	
}
public class LambdaExpresAss2 {

	public static void main(String[] args) {
		List<Orders> l=new ArrayList<Orders>();
		l.add(new Orders(200000,"Accepted"));
		l.add(new Orders(300000,"Accepted"));
		l.add(new Orders(200," NotAccepted"));
		l.add(new Orders(10000,"NotAccepted"));
		
		Stream<Orders> f=l.stream().filter(p->p.price>10000 && p.status.contains("Accepted"));
		f.forEach(order->System.out.println(order.price+" "+order.status));
	}

}
