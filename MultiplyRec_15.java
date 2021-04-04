/*15. Implement a JAVA program to multiply two numbers using recursive multiplication.*/

class MultiplyRec_15{
	
		static int result=0;
	static int multiply(int n1,int n2){
		if(n2 > 0){
			result=result+n1;
			return multiply(n1,n2-1);
		}
		else{
			return result;
		}
	}
	
	public static void main(String args[]){
		
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		//int result=0;
		
		
		int a=multiply(n1,n2);
		
		System.out.println("product is : "+a);
		
	}
}