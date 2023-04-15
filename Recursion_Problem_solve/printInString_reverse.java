package Recursion_Problem_solve;

public class printInString_reverse {
	public static void reverStr(String name, int index) {
		if( index == 0) {
			System.out.println(name.charAt(index));
			return;
		}
		System.out.print(name.charAt(index));
		reverStr(name, index-1);
	}
	public static void main(String[] args) {
		String name = "ABID";
		reverStr(name, name.length()-1);
	}
}
