class Bank{
	private String name;
	protected double balance;
	public Bank(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
class SavingAcc extends Bank{
	public static final double fixeddeposit=300000;
	public SavingAcc(String name, double balance) {
		super(name, balance);
		
	}
	public double getBalance() {
		return balance+fixeddeposit;
	}

	
	
}
class CurrentAcc extends Bank{
	public CurrentAcc(String name, double balance) {
		super(name, balance);
		// TODO Auto-generated constructor stub
	}

	public static final double cashcredit=40000;
	
	public double getBalance() {
		return balance+cashcredit;
	}

	
}
public class BankpolyAss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAcc sa=new SavingAcc("Canara",2000);
		CurrentAcc ca=new CurrentAcc("SBI",3000);
		System.out.println("Bank name is " + sa.getName()+ " Total cash is "+sa.getBalance());
		System.out.println("Bank name is " + ca.getName()+ " Total cash is" +ca.getBalance());

	}

}
