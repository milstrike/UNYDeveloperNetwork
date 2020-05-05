package javaDiamond;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaDiamond {

	private static Scanner initInput() {
		return new Scanner(System.in);
	}
	
	private static int getInput() {
		int x = 0;
		boolean cases = true;
		while(cases) {
			try {
				cases = false;
				System.out.print("Masukkan tinggi diamond: ");
				x = initInput().nextInt();
			}
			catch(InputMismatchException e) {
				cases = true;
				System.out.println("Masukan harus berupa Angka!");
			}
		}
		return x;
	}
	
	private static void spaceCreator(int space) {
		for(int i = 0; i < space; i++) {
			System.out.print("  ");
		}
	}
	
	private static void topTriangle (int height) {
		int alpha = height - 1;
		for(int i = 1; i <= height; i++) {
			spaceCreator(alpha);
			for(int a = 0; a < i; a++) {
				System.out.print("*   ");
			}
			alpha--;
			System.out.println("");
		}
	}
	
	private static void bottomTriangle(int height) {
		int alpha = 1;
		for(int i = height-1; i > 0; i--) {
			spaceCreator(alpha);
			for(int a = 0; a < i; a++) {
				System.out.print("*   ");
			}
			alpha++;
			System.out.println("");
		}
	}
	
	public static void begin() {
		System.out.println("Program Diamond Java\nCoded by Muhammad Irfan Luthfi\ngithub.com/milstrike\n");
	}
	
	public static String end() {
		String loopStatus = "";
		boolean exitQuestion = true;
		while(exitQuestion) {
			System.out.print("Lanjutkan? (Y/T): ");
			loopStatus = initInput().next();
			if(loopStatus.equalsIgnoreCase("t")  || loopStatus.equalsIgnoreCase("y")) {
				exitQuestion = false;
			}
			else {
				System.out.println("Masukan hanya Y atau T!");
			}
		}
		return loopStatus;
	}
		
	public static void main(String[] args) {
		String loopStatus = "y";
		while(loopStatus.equalsIgnoreCase("y")) {
			int height = getInput();
			topTriangle(height);
			bottomTriangle(height);
			loopStatus = end();
		}
	}
	
}
