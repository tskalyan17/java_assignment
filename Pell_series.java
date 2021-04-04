/*35. Implement a Java program to print the first 15 numbers of the Pell series
-- each number = 2*prev number + pre to prev number*/

class Pell_series{
	public static void main(String args[]){
		
		int i=0,a=0,b=1,num=0;
		
		for(i=0;i<15;i++){
			num=2*a+b;
			
			b=a;
			a=num;
			System.out.println(num);
		}
	}
}