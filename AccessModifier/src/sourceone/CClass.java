package sourceone;

public class CClass {
	protected String a = "Halo dari CClass";
	
	protected void methoCClass() {
		System.out.println(a);
	}
}

class inCClass{
	static CClass c = new CClass();
	
	public static void main(String[] args) {
		c.methoCClass();
	}	
}
