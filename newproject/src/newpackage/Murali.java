package newpackage;

import java.util.Scanner;

public class Murali {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] arr = input.split("");
		
		int length = input.length();
		int le = length;
		
		pyramid(arr, length, le);
	}
	
	static void pyramid(String[] arr, int l, int le) {
		if(l >= 0) {
			pyramid(arr, l-1, le);
			space(le-l+1);
			for(int i = 0; i < l; i++) {
				System.out.print(arr[i]);
			}
			for(int i = l-2; i >= 0; i--) {
				System.out.print(arr[i]);
			}
			System.out.println(" ");
		}
		
	}
	
	static void space(int l) {
		for(int i=1; i<l; i++) {
			System.out.print(" ");
		}
	}
}