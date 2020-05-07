package javaPrime;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaPrime {
	
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
			System.out.println("Kesalahan: Nilai minimal harus lebih dari 1!\n");
			return true;
		}
		else {
			return false;
		}
	}
	
	private static boolean maxValidation(int min, int max) {
		if(max < min) {
			System.out.println("Kesalahan: Nilai maksimal tidak boleh lebih kecil dari nilai minimal!\n");
			return true;
		}
		else {
			return false;
		}
	}
	
	private static void generatePrime(int min, int max) {
		int status = 0;
		for(int i = min; i <= max; i++) {
			for(int a = 1; a <= i; a++) {
				int result = i%a;
				if(result == 0) {
					status++;
				}
			}
			if(status < 3) {
				System.out.print(i + " ");
			}
			status = 0;
		}
	}
	
	private static void begin() {
		System.out.println("Java Prime");
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
		boolean appLoop = true, minLoop = true, maxLoop = true;
		int min = 0, max = 0;
		begin();
		while(appLoop) {
			while(minLoop || maxLoop) {
				min = getInput("Masukkan nilai awal");
				max = getInput("Masukkan nilai akhir");
				minLoop = minValidation(min);
				maxLoop = maxValidation(min, max);
			}
			minLoop = true; maxLoop = true;
			generatePrime(min, max);
			System.out.println();
			appLoop = end();
		}
	}
}
