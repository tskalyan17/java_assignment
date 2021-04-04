/*22. Check whether the number is a palindrome number or not.*/

class Palindrome{
	
	static int input,reverse=0,num,digit;
	public static void main(String args[]){
		
		input=Integer.parseInt(args[0]);
		
		num=input;
		while(num != 0){
			digit=num%10; 
			num=num/10;
			reverse= (reverse*10) +digit;
			
			
		}
		System.out.println("input : "+input);
		System.out.println("reverse : "+reverse);
		
		if(reverse==input){
			System.out.println(input+" is a palindrome");
		}
		else{
		System.out.println(input+" not a palindrome");
		}
	}
}