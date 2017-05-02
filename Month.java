package task1;


import java.util.Scanner;


public class Month {
	public static void main(String[] args){
		
		int month_days [] = {31, 29, 31, 30, 31, 30,
				31, 31, 30, 31, 30, 31};
		System.out.println("Write the number of month");
		Scanner sc = new Scanner(System.in);
		String i = sc.nextLine();
		int month = Integer.parseInt(i);
		System.out.println("this month has days " + month_days[month - 1]);
		
		
		
		

		}
		
		
	}
	


