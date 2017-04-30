package Lesson1;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;


public class Main {
	public static void main (String[] args){
		Tariff t1 = new Tariff();
		t1.setCountry("Ukraine");
		t1.setPrice(5);
		Tariff t2 = new Tariff();
		t1.setCountry("USA");
		t1.setPrice(8);
		Tariff t3 = new Tariff();
		t1.setCountry("Japan");
		t1.setPrice(7);
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть кількість хвилин для першої країни");
		String s1 = sc.nextLine();
		int time = Integer.parseInt(s1);
		System.out.println("Тариф для першої країни становить :" + t1.getSum(time));
		System.out.println("Введіть кількість хвилин для другої країни");
		String s2 = sc.nextLine();
		time = Integer.parseInt(s2);
		System.out.println("Тариф для другої країни становить :" + t2.getSum(time));
		System.out.println("Введіть кількість хвилин для третьої країни");
		String s3 = sc.nextLine();
		time = Integer.parseInt(s3);
		System.out.println("Тариф для третьої країни становить :" + t3.getSum(time));
		
	}
	

}
