/*40. Implement a Java program to compute body mass index (BMI).*/


class Bmi{
	
	public static void main(String args[]){
		
		double weight=Double.parseDouble(args[0]);
		double height=Double.parseDouble(args[1]);
		
		double BMI=weight*(height*height);
		
		System.out.println(BMI+" = BMI");
	}
}