package Car;

public class BusCar extends Car {
	int run=1;
	int money=100;
	void moving() {
		System.out.println("Bus move");
	}
	void mm() {
		System.out.println("mm");
	}
	public BusCar() {};
	public BusCar(int i) {
		this.money = 10;
	}
}
