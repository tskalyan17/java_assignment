/*51. Find the hexadecimal equivalent for a given 4-digit binary number.*/

import java.lang.Math;

class Hexadecimal{
	
	public static void main(String args[]){
		
		int bin=Integer.parseInt(args[0]);
		
		int dec=0,i=0;
		
		String hexadecimal;
		
		while(bin != 0){
			
			dec=dec+bin%10*(int)Math.pow(2,i);
			i++;
			bin=bin/10;
		}
		
		hexadecimal= Integer.toHexString(dec);
		hexadecimal=hexadecimal.toUpperCase();
		
		System.out.println("bin = "+args[0]+"  hexadecimal = "+hexadecimal);
		
	}
}