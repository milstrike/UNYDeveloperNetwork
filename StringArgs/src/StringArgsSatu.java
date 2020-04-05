public class StringArgsSatu {
	public static void main(String[] args) {
		String kalimat = "";
		for(int i = 0; i<args.length; i++) {
			kalimat += args[i] + " ";
		}
		System.out.println(kalimat);
	}
}