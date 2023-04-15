package Recursion_Problem_solve;

public class checkAnarrayIs_Sorted_Strictly_increasing {
	public static boolean isSorted(int a[], int index) {
		if(index == a.length-1 ) {
			return true;
		}
		if(a[index] >= a[index+1]) {
			//array is Unsorted
			return false;
		}
		return isSorted(a,index+1);
	}
	
	public static void main(String[] args) {
		int a[] = {1,3,3,5};
		System.out.println(isSorted(a, 0));
	}
}
