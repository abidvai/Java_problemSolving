package Patterns;
import java.util.*;

public class type_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = i; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
