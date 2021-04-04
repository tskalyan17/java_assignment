/*34. Implement a Java program to find all the narcissistic numbers between 1 and 1000. (same as armstrong number)*/
import java.lang.Math;

class Narcissistic_number{
	
	public static void main(String args[]){
		
		
		int length=0;
		int digit=0,sum=0;
		
		for(int input=1;input<1000;input++){
			int var=input,in=input;
			String s=Integer.toString(var);
			length=s.length();
			
			
		while(in !=0){
			digit=in%10;
			sum=sum+(int)Math.pow(digit,length);
			in=in/10;
		}
		if(sum==var){
			System.out.println(var);
		
		}
		sum=0;
		
		}
		
	}
}