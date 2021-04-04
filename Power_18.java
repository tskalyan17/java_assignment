/*18. Find the power of the number without using existing methods. */

class Power_18{
	public static void main(String args[]){
		int power = 4;
		int base = 3;
		int n = base;
		while(power > 1){
			n = n * base;
			System.out.println(n);
			power--;
		}
		System.out.println("result : " + n);
	}
}