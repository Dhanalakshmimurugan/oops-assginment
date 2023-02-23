package week5.day5;

public class AxisBank extends BankInfo {
	public void deposit(int amount) {
		System.out.println("DEPOSIT AMOUNT IS : "+amount);
	}
	public static void main(String[] args) {
		AxisBank details=new AxisBank();
		details.deposit(20000);
		details.fixed(500);
		details.saving(10000);
	}

}
