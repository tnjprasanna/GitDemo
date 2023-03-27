package progs;

public class Cube {

	static int cube(int x) {
		return x*x*x;
	}
	int a = 40;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube testInt = new Cube() ;
		int a = testInt.a;
		int result = cube(3);
		System.out.println(result);
		System.out.println(a);

	}

}
