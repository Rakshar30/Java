// Payment with abstract class
package demo1;
abstract class Payment1 {
	public abstract void processPayment1(double amount);
}
class creditPayment1 extends Payment1{
	public void processPayment1(double amount) {
		System.out.println("Crediting amount...");
	}
}
class debitPayment1 extends Payment1{
	public void processPayment1(double amount) {
		System.out.println("Amount debited...");
	}
}
class UPIPayment1 extends Payment1{
	public void processPayment1(double amount) {
		System.out.println("UPI Payment");
	}
}
public class PaymentDemo1 {
	public static void main(String [] args) {
		//creditPayment1 credit=new creditPayment1();
		//debitPayment1 debit=new debitPayment1();
		//UPIPayment1 upi=new UPIPayment1();
		//credit.processPayment1(1000);
		//debit.processPayment1(500);
		//upi.processPayment1(100);
		Payment1 cc=new creditPayment1();
		Payment1 dc=new debitPayment1();
		dc.processPayment1(10000);
		cc.processPayment1(20000);

	}
}
