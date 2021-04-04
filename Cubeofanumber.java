/*29. Implement a Java program to check a number is a cube or not.*/

import java.lang.Math;
class Cubeofanumber{
	public static void main(String args[]){
		int num = 27;
		int c = (int) Math.round(Math.pow(num, 1.0/3.0));
		if(num ==(c*c*c)){
			System.out.print("Number is a perfect cube");
		}
		else{
			System.out.print("Number is a not perfect cube");
		}
	}
}