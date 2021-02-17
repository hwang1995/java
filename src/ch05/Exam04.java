package ch05;

import java.util.Arrays;

public class Exam04 {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for(int i : arr1) {
			System.out.println(i);
		}
		
		double[] arr2 = new double[3];
		for(double i : arr2) {
			System.out.println(i);
		}
		
		boolean[] arr3 = new boolean[3];
		for(boolean i : arr3) {
			System.out.println(i);
		}
		
		String[] arr4 = new String[3];
		for(Object i : arr4) {
			System.out.println(i);
		}
	}
	
	

}
