package Lesson1;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		System.out.println("Веддіть радіус: ");
		double s = new Scanner (System.in).nextDouble();
		AnyCircle yourCircle = new AnyCircle();
		yourCircle.radius = s;
		yourCircle.P = 2 * 3.14 * yourCircle.radius;
		yourCircle.S = 2 * 3.14 * s * s;
		System.out.println(yourCircle.toString());
	}
}
		
		
		
		


