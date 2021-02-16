package ch99;

import java.util.Iterator;

/**
 * Objective : 간단한 계산을 반복문을 이용하여 해결합니다.
 * Link : https://www.hackerrank.com/challenges/java-loops-i/problem
 * Task : 정수 N이 주어지며, 1부터 10까지의 곱을 프린트 해라. (1 <= i <= 10)
 * Constraints : 2 <= N <= 20
 * @author 황성욱
 *
 */
public class java_loops_i {

	public static void main(String[] args) {
		int number = 2;
		for(int i=1; i <=10; i++) {
			System.out.println(number + " x " + i +" = " +  number * i);
		}

	}

}
