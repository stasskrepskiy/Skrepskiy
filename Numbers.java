package task1;

import java.util.Scanner;

public class Numbers {
	public static void main (String[] args){
		int number [] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i < number.length; i++){
		System.out.println("Enter integer");
		number [i]= sc.nextInt();
		}
		
		

Scanner s1 = new Scanner(System.in);
boolean res = true;
int n = 0;
int sum = 0;
for(int i = 0; i < 5; i++){
	if (number [i] <0){
		res = false;
		break;
	}
	sum+=number[i];
	
}

if (res){
	System.out.println("the sum of firs 5 elemnts is : " + sum );
}
else{
	sum= 0;
	for(int i=5; i < number.length; i++){
		sum+=number[i];
		
		
		
	}
	System.out.println(sum);
}

System.out.println("the sum of firs 5 elemnts is : " + res );
	
	

				
		}
	
	
	

}
