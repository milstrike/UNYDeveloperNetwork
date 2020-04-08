package SegitigaAngka;

/*
 * Author: Muhammad Irfan Luthfi
 * github.com/milstrike
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class SegitigaAngka {
	
	private static Scanner getScanner() {
		return new Scanner(System.in);
	}

	private static void printSpace(int spaceLength) {
		for(int i = 0; i < spaceLength; i++) {
			System.out.print(" ");
		}
	}
	
	private static void printSegitiga1(int numbers) {
		for(int i = 0; i < numbers; i++) {
			System.out.print(numbers);
		}
	}
	
	private static void printSegitiga2(int numbers) {
		for(int i=0; i < numbers; i++) {
			System.out.print(numbers);
		}
	}
	
	private static void createSegitiga(int lengthSegitiga) {
		int alpha = 1, beta = lengthSegitiga;
		for(int i = 0; i < lengthSegitiga; i++) {
			printSegitiga1(alpha);
			printSpace(beta);
			System.out.print("|");
			printSpace(beta);
			printSegitiga2(alpha);
			System.out.println("");
			alpha++;
			beta--;
		}
	}
	
	public static void main(String[] args) {
		boolean status = true;
		System.out.println("PROGRAM SEGITIGA ANGKA \nCoded in java by Muhammad Irfan Luthfi\ngithub.com/milstrike");
		System.out.println("");
		while(status) {
			try {
				System.out.print("Masukkan tinggi segitiga: ");
				createSegitiga(getScanner().nextInt());
				status = false;
			}catch(InputMismatchException e) {
				System.out.println("Masukkan harus berupa angka!");
				status = true;
			}
		}
	}
}
