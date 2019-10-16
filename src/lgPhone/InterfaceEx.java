package lgPhone;
interface PhoneInterface {
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	private void gggg() {
	}
	default void printLogo() {
		System.out.println("** Phon ***");
	}
}

interface MobilePhoneInterface extends PhoneInterface{
	void sendSMS();
	void recieveSMS();
}
class LgPhone implements PhoneInterface {

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("짜잔");
		
		
	}
	

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화왓다");
	}
	public void flash() {
		System.out.println("전화기켜짐");
	}
	
}
public class InterfaceEx {
	public static void main(String args[]) {
		LgPhone phone = new LgPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
