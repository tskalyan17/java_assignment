/*27. Implement a Java program to check two numbers are Amicable numbers or not.*/

class Amicable_number{
	public static void main(String args[]){
		int n1 = 420;
		int n2 = 253;
		int i, sum1 = 0, sum2 = 0;
		for( i = 1; i < n1; i++){
			if((n1 % i) == 0){
				sum1= sum1 + i;
			}
		}
		for( i = 1; i < n2; i++){
			if((n2 % i) == 0){
				sum2 = sum2 + i;
			}
		}
		if(( sum1 == n2) && (sum2 == n1)){
			System.out.println("Amicable numbers");
		}
		else{
			System.out.println("Not Amicable numbers");
		}
		
	}
}