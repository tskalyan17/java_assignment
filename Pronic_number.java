/*24. Implement a Java program to check whether a number is a Pronic Number or Heteromecic Number or not.*/

import java.lang.Math;

class Pronic_number{
	public static void main(String args[]){
		
		double input=Double.parseDouble(args[0]);
		double floorvalue,result,root;
		
		root=Math.sqrt(input);
		
		floorvalue=Math.floor(root);
		
		result=floorvalue*(floorvalue+1);
		
		if(input == result){
			System.out.println(input+" is a pronic number");
		}
		else{
			System.out.println(input+" not a pronic number");
		}
	}
}