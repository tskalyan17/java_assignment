/*30. Implement a Java program to check a number is a cyclic or not.*/

class Cyclic{
	
	public static void main(String args[]){
		
		int input=Integer.parseInt(args[0]);
		
		String s=args[0];
		int length=s.length();
		
		int digit=0,i=0,num=1,in=input,numcopy=0,count=0;
		
		while(i < length-1){
			
			num=num*10;
			i++;
		}
		numcopy=num;
		
	
		i=0;
		while(i<length){		
			digit=input%10;
			num=num*digit;
			input=input/10;
			num=num+input;
			input=num;
			System.out.println(in);
			
			if(input%in == 0){
				count++;
			}
				
			i++;
			num=numcopy;
		}
		if(count == length){
			System.out.println(in+" is a cyclic number");
		}
		else{
			System.out.println(in+" not a cyclic number");
		}
	}
}