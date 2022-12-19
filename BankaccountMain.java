package practiseProblemsDay11_12;

public class BankaccountMain {
	private int Number;
	private Double Balance;
	private String Name;
	private String Email;
	private int PhoneNumber;

	public BankaccountMain(int i, double Balance, String Name, String Email, int PhoneNumber) {
		this.Number=i;
		this.Balance=Balance;
		this.Name=Name;
		this.Email=Email;
		this.PhoneNumber=PhoneNumber;

	}

	public void DepositMoney(double DepositedMoney) {
		this.Balance= Balance+DepositedMoney;
		System.out.println("Deposit is Successfull, New Balance is "+ this.Balance);
	}

	public void WithDrawMoney(double WithdrawlMoney) {
		if(this.Balance - WithdrawlMoney < 0){
			System.out.println("WithDraw Unsuccesfull" + this.Balance+ "is left");  
		} else {
			this.Balance = Balance -WithdrawlMoney;
			System.out.println("Withdraw Succesfull. Current Balance is " + this.Balance);

		}

	}


	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
	}
	public Double getBalance() {
		return Balance;
	}
	public void setBalance(Double balance) {
		Balance = balance;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}

}
