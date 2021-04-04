/* Implement a JAVA program to find the GCF  and LCM of given numbers input through command line*/

class gcdlcm_7{
	public static void main(String args[]){
		int n1 = 20;
		int n2 = 135;
		int i, gcd = 0;
		int j = 1;
		int temp1 = n1;
		int temp2 = n2;
		for(i = 1; i <= Math.max(n1, n2); i++){
			if((n1 % i) == 0 && (n2 % i) == 0){
				gcd = i;
			}
		}
		System.out.println("GCD is " + gcd);
		i = 1;
		while(temp1 != temp2){
			if(temp2 > temp1){
				temp1 = temp1 * i;
				i++;
				}
			if (temp1 > temp2){
				temp2 = temp2 * j;
				j++;
				}
		}
		System.out.println("LCM is " + temp1);
		
	}
	
}