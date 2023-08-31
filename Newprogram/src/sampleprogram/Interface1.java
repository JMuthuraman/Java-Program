package sampleprogram;

	class Person {
	private String name;
	private String city;
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getCity() {
	return city;
	}
	public void setCity(String city) {
	this.city = city;
	}
	public Person(String name, String city) {
	super();
	this.name = name;
	this.city = city;
	}
	public Person() {
	super();
	}
	}
	//Program to define Bank interface
	
	 interface Bank {
	static final float MINBAL=2000;
	static final float DEPOSIT_LIMIT=40000; 
	public void deposit(float amount);
	public void withdraw(float amount);
	}
	//Program to implement interface
		//Person
	 class SavingAccount extends Person implements Bank 
	{
	private int accNo;
	private float balance;
	public SavingAccount(String name, String city, int accNo, 
	float balance) {
	super(name, city);
	this.accNo = accNo;
	this.balance = balance;
	}
	public int getAccNo() {
	return accNo;
	}
	public void setAccNo(int accNo) {
	this.accNo = accNo;
	}
	public float getBalance() {
	return balance;
	}
	public void setBalance(float balance) {
	this.balance = balance;
	}
	//implements Bank method
	@Override
	public void deposit(float amount) {
	if (amount > DEPOSIT_LIMIT)
	System.out.println("Daily limit exceeds...");
	else {
	balance += amount;
	System.out.println("Rs. "+amount+" deposited successfully" );
	}
	}
	//implements Bank method
	@Override
	public void withdraw(float amount) {
	if (amount <= balance - MINBAL) {
	balance -= amount;
	System.out.println("Rs. "+amount+" withdraw successfully..");
	} else
	System.out.println("Insufficient Balance cannot withdraw");
	}
	@Override
	public String toString() {
	return "SavingAccount [Name =" + getName() + "\tCity = " + 
	getCity() + "\taccNo=" + accNo + ", balance="
	+ balance + "]";
	}
	}
	//Program to demonstrate interface
	public class Interface1 {
	public static void main(String[] args) {
	SavingAccount sa=new SavingAccount("Muthu", "Trichy", 40, 
	41000);
	System.out.println(sa);
	sa.deposit(22000);
	System.out.println(sa);
	sa.withdraw(10000);
	System.out.println(sa);
	sa.withdraw(90000);
	System.out.println(sa);
	sa.deposit(220000);
	System.out.println(sa);
	}

}
