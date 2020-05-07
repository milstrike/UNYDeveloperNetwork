package javaPrime;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaPrime2 {
	
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
				System.out.println("Masukan harus berupa bilangan bulat!. Silakan ulangi lagi!\n");
			}
		}
		return alpha;
	}
	
	private static boolean minValidation(int min) {
		if(min < 2) {
			System.out.println("Kesalahan: Bilangan harus lebih dari 1!\n");
			return true;
		}
		else {
			return false;
		}
	}
	
	private static void checkPrime(int input) {
		int status = 0;
		for(int a = 1; a <= input; a++) {
			int result = input%a;
			if(result == 0) {
				status++;
			}
		}
		if(status < 3) System.out.print(input + " adalah Bilangan Prima"); 
		else System.out.print(input + " bukan Bilangan Prima");
	}
	
	private static void begin() {
		System.out.println("Java Prime 2");
		System.out.println("Coded by Muhammad Irfan Luthfi");
		System.out.println("github.com/milstrike\n");
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
		boolean appLoop = true, valLoop = true;
		int input = 0;
		begin();
		while(appLoop) {
			while(valLoop) {
				input = getInput("Masukkan bilangan yang ingin dicek");
				valLoop = minValidation(input);
			}
			valLoop = true;
			checkPrime(input);
			System.out.println();
			appLoop = end();
		}
	}

}