package Patterns;
import java.util.*;
import java.util.Scanner;

public class type_9 {
	
	public static void abid(int n) {
		for(int i=0; i < n; i++) {
			for(int j=0; j < n-i-1; j++) {
				System.out.print(" ");
			}
			for(int j=0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			for(int j=0; j < n-i-1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void abidvai(int n) {
		for(int i=0; i < n; i++) {
			for(int j=0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j < 2*n - (2*i+1); j++) {
				System.out.print("*");
			}
			for(int j=0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		
		int n=5;
		
		abid(n);
		abidvai(n);
	}
}
