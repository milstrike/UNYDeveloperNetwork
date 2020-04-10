package segitigaJava;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SegitigaSikuSiku {

	private static Scanner getInput() {
		return new Scanner(System.in);
	}
	
	private static void createSegitiga(int tinggiSegitiga) {
		for(int i = 1; i <= tinggiSegitiga; i++) {
			for(int a = 0; a < i; a++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		boolean status = true;
		System.out.println("Program Segitiga Siku - Siku\nCoded in Java by Muhammad Irfan Luthfi\ngithub.com/milstrike");
		while(status) {
			System.out.print("Masukkan tinggi segitiga: ");
			try {
				createSegitiga(getInput().nextInt());
				status = false;
			}
			catch(InputMismatchException e){
				System.out.println("Masukan harus berupa Angka!");
				status = true;
			}
		}
	}
	
}
