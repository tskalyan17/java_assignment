/*25. Implement a Java program check whether a number is an Automorphic number or n.*/

class Automorphic_number{
	public static void main(String args[]){
		int input= Integer.parseInt(args[0]);
		int lastdigit,sq;
		
		sq=input*input;
		
		lastdigit=sq%10;
		
		if(lastdigit==input){
			System.out.println(input+" is a Automorphic number");
		}
		else{
			System.out.println(input+" not a Automorphic number");
		}
	}
}