/*21. Implement Java program to check if a given number is Fibonacci number or not.*/

class Fibonacci_21{
	public static void main(String args[]){
		int n = 15;
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		while(n3 <= n){
			if(n3 == n){
				System.out.println("Number is a fibonacci");
				return;
			}
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;		
		}
		System.out.println("Number is not fibonacci");
	}
}