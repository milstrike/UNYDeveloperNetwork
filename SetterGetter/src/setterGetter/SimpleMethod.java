package setterGetter;

public class SimpleMethod {
	private static GeneralVariable gv = new GeneralVariable();
	
	public static void main(String[] args) {
		gv.setText("Halo Nama Saya Irfan");
		System.out.println(gv.getText());
	}

}
