package setterGetter;

import java.util.Scanner;

public class SetterGetter {
	
	private static GeneralVariable gv = new GeneralVariable();
	
	private static Scanner initInput() {
		return new Scanner(System.in);
	}
	
	private static void getInput() {
		System.out.print("Masukkan Sesuatu: ");
		String x = initInput().nextLine();
		gv.setText(x);
	}
	
	private static void displayInput() {
		System.out.println("Anda baru saja memasukkan: " + gv.getText());
	}
	
	private static boolean end() {
		boolean status = true;
		boolean appStatus = true;
		String alpha = "";
		while(status) {
			System.out.print("Lanjutkan? (Y/N): ");
			alpha = initInput().next();
			if(alpha.equalsIgnoreCase("Y") || alpha.equalsIgnoreCase("N")) {
				status = false;
				if(alpha.equalsIgnoreCase("Y")) appStatus = true;
				else appStatus = false;
			}
			else {
				status = true;
				System.out.println("Masukan hanya Y/N!");
			}
		}
		return appStatus;
	}
	
	public static void main(String[] args) {
		boolean continyu = true;
		while(continyu) {
			getInput();
			displayInput();
			continyu = end();
		}
	}
}
