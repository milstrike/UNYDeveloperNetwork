package segitigaJava;

/*
 * Author: Muhammad Irfan Luthfi
 * github.com/milstrike
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class SegitigaSimetris {

	private static Scanner getInput() {
		return new Scanner(System.in);
	}
	
	private static void createSpace(int space) {
		for(int i = 0; i < space; i++) {
			System.out.print(" ");
		}
	}
	
	private static void createShape(int shape) {
		for(int i = 0; i < shape; i++) {
			System.out.print("* ");
		}
	}
	
	private static void createSegitiga(int tinggiSegitiga) {
		int space = tinggiSegitiga;
		for(int i = 1; i <= tinggiSegitiga; i++) {
			createSpace(space);
			createShape(i);
			System.out.println("");
			space--;
		}
	}
	
	public static void main(String[] args) {
		boolean status = true;
		System.out.println("Program Segitiga Simetris\nCoded in Java by Muhammad Irfan Luthfi\ngithub.com/milstrike");
		while(status) {
			System.out.print("Masukkan tinggi Segitiga: ");
			try {
				createSegitiga(getInput().nextInt());
				status = false;
			}catch(InputMismatchException e) {
				System.out.println("Masukan harus berupa angka!");
				status = true;
			}
		}
	}
}
