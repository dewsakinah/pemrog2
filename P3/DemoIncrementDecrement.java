public class DemoIncrementDecrement {

	public static void main(String[] args) {
		int x=1, y=1, z=1;

		//Nilai Awal 
		System.out.println("Niali x : " + x);
		System.out.println("Niali y : " + y);
		System.out.println("Niali z : " + z);

		//Increment
		x++; y++;
		System.out.println("Niali x : " + x);
		System.out.println("Niali y : " + y++);
		System.out.println("Niali z : " + ++z);

		System.out.println("Nilai y : " + y);

		//Decrement
		x--; y--;
		System.out.println("Niali x : " + x);
		System.out.println("Niali y : " + y--);
		System.out.println("Niali z : " + --z);

		System.out.println("Nilai y : " + y);
	}
}


