package javaFibonacci;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaFibonacci {
	
	private static Scanner initInput() {
		return new Scanner(System.in);
	}
	
	private static int getInput() {
		int alpha = 0;
		boolean inputLoop = true;
		while(inputLoop) {
			try {
				System.out.print("Masukkan panjang deret Fibonacci: ");
				alpha = initInput().nextInt();
				inputLoop = false;
			}
			catch(InputMismatchException e) {
				System.out.println("Masukan harus berupa bilangan bulat! ");
				inputLoop = true;
			}
		}
		return alpha;
	}
	
	private static void generateFibonacci(int limit) {
		long a = 0;
		long b = 1;
		int value = 0;
		while(value < limit) {
			if(value < limit) {
				System.out.print(a + " ");
				a = a + b;
				value ++;
			}
			if(value < limit) {
				System.out.print(b + " ");
				b = b + a;
				value++;
			}
		}
	}
	
	private static void begin() {
		System.out.println("Program Deret Fibonacci\nCoded by Muhammad Irfan Luthfi\ngithub.com/milstrike\n");
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
				System.out.println("Masukan yang diterima hanya Y/N!");
			}
		}
		return appStatus;
	}
	
	public static void main(String[] args) {
		boolean appLoop = true;
		begin();
		while(appLoop) {
			generateFibonacci(getInput());
			System.out.println();
			appLoop = end();
		}
		
	}
	
}
