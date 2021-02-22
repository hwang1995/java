package ch06.exam09;

public class Calculator {
	// 도형의 면적을 구하는 메소드를 만들고 싶다면?
	// 정사각형 면적
	double area(double w) {
		return w * w;
	}
	
	// 직사각형 면적
	double area(double w, double h) {
		return w * h;
	}
	
	// 원의 면적
	double areaCircle(double r) {
		return r * r * Math.PI;
		
	}

}
