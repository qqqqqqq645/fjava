package Car;

public class ExCar {
	public static void main(String args[]) {
		Car a = new BusCar();
		a.moving();
	//	System.out.println(a.jj);
		System.out.println(a.run);
		//System.out.println(a.money);
		//a.mm
		//a.engines();
		
		BusCar b = (BusCar) a;
//		System.out.println(b.jj);
		System.out.println(b.run);
		b.moving();
		b.engines();
		b.mm();
		System.out.println(b.asdfg);
	}
}
