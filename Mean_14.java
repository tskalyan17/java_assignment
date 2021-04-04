/*14. Implement a JAVA program to find the Mean of given 5 numbers. */

class Mean_14{
	
	public static void main(String args[]){
		
		float n1= Float.parseFloat(args[0]);
		float n2= Float.parseFloat(args[1]);
		float n3= Float.parseFloat(args[2]);
		float n4= Float.parseFloat(args[3]);
		float n5= Float.parseFloat(args[4]);
		
		float mean=(n1+n2+n3+n4+n5)/5;
		
		System.out.println("The mean of 5 numbers "+n1+" "+n2+" "+n3+" "+n4+" "+n5+"="+mean);
	}
}