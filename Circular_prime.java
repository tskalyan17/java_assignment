/*28. Implement a Java program to check if a given number is circular prime or not.*/
class Circular_prime{
	static boolean isPrime(int n){
		int i;
		for(i = 2; i < n; i++){
			if((n % i) == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		int length = String.valueOf(n).length();
		int mask = 1, i;
		int digit;
		for( i = 0; i < length - 1 ; i++){
			mask = mask * 10;
		}
		//System.out.println(mask);
		for(i = 0; i < length; i++){
			digit = n % 10;
			n = n / 10;
			//System.out.println(digit);
			n = (digit * mask) + n;
			//System.out.println(n);
			if(!(isPrime(n))){
				System.out.println("Number is not circular prime");
				return;
			}
		}
		System.out.println("Number is circular prime");
	}
}