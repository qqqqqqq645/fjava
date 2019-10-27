package Car;

public class Car {
	int run = 5;
	int jj = 1;
	String asdfg;
	void moving() {
		System.out.println("move!");
	}
	void engines() {
		System.out.println("engine");
	}
}
class NomCar extends Car{
	int ff = 12;
	void moving() {
		System.out.println("nom move");
	}
}