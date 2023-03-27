package progs;

public class ObjInit {
	
	int id;
	String name;
	
	ObjInit(int i, String n){
		
	}
	
	ObjInit(ObjInit oi){
		id = oi.id;
		name = oi.name;
	}
	
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjInit ob1 = new ObjInit(111,"Karan");
		ObjInit ob2	= new ObjInit(ob1);
		ob1.display();
		ob2.display();

	}



}
