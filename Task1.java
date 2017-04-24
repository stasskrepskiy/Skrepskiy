package Lesson1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("¬вед≥ть значенн€ a ");
		String s1 = sc.nextLine();	
		int a = Integer.parseInt(s1);
		System.out.print("¬вед≥ть значенн€ b ");
		String s2 = sc.nextLine();
		int b = Integer.parseInt(s2);
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println((double)a/(double)b);
		// TODO Auto-generated method stub

	}

}
