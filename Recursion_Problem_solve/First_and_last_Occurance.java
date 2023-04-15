package Recursion_Problem_solve;

public class First_and_last_Occurance {
	public static int first = -1;
	public static int last = -1;
	
	public static void findOccurance(String str, int index, char element) {
		if(index == str.length()) {
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char currentChar = str.charAt(index);
		if(currentChar == element) {
			if(first == -1) {
				first = index;
			}
		}else {
			last = index;
		}
		findOccurance(str,index+1,element);
	}
	
	public static void main(String[] args) {
		String str = "abaacdaefaah";
		findOccurance(str,0,'a');
	}
	
}
