/*44. Implement a java program to count the repeted occurance of a digit in a n-digit number.*/

class number_occurance{
	
	public static void main(String args[]){
		
		int num=Integer.parseInt(args[0]);
		int digit=Integer.parseInt(args[1]);
		int count=0,bit=0,numcopy=num;
		
		while(num != 0){
			bit=num%10;
			if(digit==bit){
				count++;
			}
			num=num/10;
		}
		
		System.out.println("the number of occurance of "+digit+" in "+numcopy+" is "+count);
	}
}