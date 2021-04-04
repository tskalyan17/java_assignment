/*23. Implement a Java program to check whether a number is a Harshad Number or not.*/

class Harshad_number{
	public static void main(String args[]){
		int num = 111;
		int var = num;
		int sum = 0;
		int digit;
		while(num > 0){
			digit = num % 10;
			num = num / 10;
			sum = sum + digit;
		}
		if((var % sum) == 0){
			System.out.println("It is a Harshad number");
		}
		else{
			System.out.println("Not a Harshad number");
		}
	}
}
