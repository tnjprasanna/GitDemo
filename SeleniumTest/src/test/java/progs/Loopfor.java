package progs;

public class Loopfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerLoop:
		for(int i =0; i<5;i++) {
			innerLoop:
			for (int j=0;j<5;j++) {
				if(i != j) {
					System.out.println("if block values i="+i);
					break outerLoop;
				} else {
					System.out.println("Else block values j=" +j);
					break innerLoop;
				}
			}
		}

	}

}