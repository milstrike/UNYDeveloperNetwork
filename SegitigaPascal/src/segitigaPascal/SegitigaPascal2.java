package segitigaPascal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SegitigaPascal2 {
	
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
	
	public static void main(String[] args) {
		printPascal(getInput("Enter number of the lines"));
	}
}
