package org.sum;

public class Sum {
	public static void main(String[] args) {
		int sum=0;
		float avg;
		int a[]=new int[] {10,12,2,3,4,5,20};
		 for (int i=0;i<a.length;i++) {
			sum= sum+a[i];
			}
	 avg = (float) sum/a.length;
	   System.out.println("The Sum is  "+sum);
	   System.out.println("The average is "+avg);
	}
}

