package Recursion_Problem_solve;

public class moveAll_x {
	public static boolean[] map = new boolean[26];
	
	public static void removeDuplicates(String str, int index, String newString) {
		if(index == str.length()) {
			System.out.println(newString);
			return;
		}
		char current = str.charAt(index);
		if(map[current - 'a']) {
			removeDuplicates(str,index+1,newString);
		}else {
			newString += current;
			map[current - 'a'] = true;
			removeDuplicates(str,index+1,newString);
		}
	}
	
	public static void main(String[] args) {
		String str = "aabbccdd";
		removeDuplicates(str,0,"");
	}
}
