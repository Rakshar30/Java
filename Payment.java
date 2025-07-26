package demo1;
class Payment{
	void processPayment(double amount){
		System.out.println("Genric payment amount");
	}
}
class creditPayment extends Payment{
	void processPayment(double amount) {
		System.out.println("Crediting amount...");
	}
}
class debitPayment extends Payment{
	void processPayment(double amount) {
		System.out.println("Amount debited...");
	}
}
class UPIPayment extends Payment{
	void processPayment(double amount) {
		System.out.println("UPI Payment");
	}
}
public class PaymentDemo {
	public static void main(String [] args) {
		creditPayment credit=new creditPayment();
		debitPayment debit=new debitPayment();
		UPIPayment upi=new UPIPayment();
		credit.processPayment(1000);
		debit.processPayment(500);
		upi.processPayment(100);
	}
}
