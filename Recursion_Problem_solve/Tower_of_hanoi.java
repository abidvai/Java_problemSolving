package Recursion_Problem_solve;

public class Tower_of_hanoi {
	public static void towerOfHanoi(int n, String src, String helper, String destination) {
		if(n == 1) {
			System.out.println("Transfer Disk " + n + " From " + src + " To " + destination);
			return;
		}
		towerOfHanoi(n-1,src,destination,helper);
		System.out.println("Transfer Disk " + n + " From " + src + " To " + destination);
		towerOfHanoi(n-1,helper,src,destination);
	}
	public static void main(String[] args) {
		int n = 3;
		towerOfHanoi(n,"S","H","D");
	}
}
