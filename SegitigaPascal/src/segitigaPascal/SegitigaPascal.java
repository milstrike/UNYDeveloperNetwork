package segitigaPascal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SegitigaPascal {
	
	private static Scanner initInput() {
		return new Scanner(System.in);
	}
	
	private static int getInput(String message) {
		int alpha = 0;
		boolean status = true;
		while(status) {
			try {
				System.out.print(message + ": ");
				alpha = initInput().nextInt();
				status = false;
			}	
			catch(InputMismatchException e) {
				status = true;
				System.out.println("Input must be a integer. Please try again!!\n");
			}
		}
		return alpha;
	}
	
	private static int calculateElements(int n, int k) {
		int res = 1;
		if(k > (n - k)) {
			k = n - k;
		}
		
		for(int i = 0; i < k; i++) {
			res = res * (n - i);
			res = res / (i + 1);
		}
		
		return res;
	}
	
	private static void printSpace(int a, int b) {
		a = a / 2;
		for(int i = b; i <= a; i++) {
			System.out.print("  ");
		}
	}
	
	private static void printPascal(int a) {
		for(int b = 0; b < a+1; b++) {
			printSpace(2*a, b);
			for(int c = 0; c <= b; c++) {
				System.out.print(calculateElements(b, c));
				if(calculateElements(b, c) < 10) {
					System.out.print("   ");
				}
				else if(calculateElements(b, c) >= 10 && calculateElements(b,c) < 100) {
					System.out.print("  ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	
	public static void begin() {
		System.out.println("Pascal Triangle App Generator");
		System.out.println("Program written in Java Language");
		System.out.println("Program Owner: Muhammad Irfan Luthfi (github.com/milstrike)");
		System.out.println("===========================================================");
	}
	
	private static boolean end() {
		boolean status = true;
		boolean appStatus = true;
		String alpha = "";
		while(status) {
			System.out.print("Continue? (Y/N): ");
			alpha = initInput().next();
			if(alpha.equalsIgnoreCase("Y") || alpha.equalsIgnoreCase("N")) {
				status = false;
				if(alpha.equalsIgnoreCase("Y")) appStatus = true;
				else appStatus = false;
			}
			else {
				status = true;
				System.out.println("Only accept Y/N!");
			}
		}
		return appStatus;
	}
	
	public static void main(String[] args) {
		boolean appLoop = true;
		begin();
		while(appLoop) {
			printPascal(getInput("Enter number of the lines"));
			System.out.println();
			appLoop = end();
		}
	}
}
