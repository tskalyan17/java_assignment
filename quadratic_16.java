import java.util.Scanner;
import java.lang.Math;

class quadratic_16{
	public static void main(String []args){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a,b,c of a quadratic equation");
		double a=obj.nextDouble();
		double b=obj.nextDouble();
		double c=obj.nextDouble();
		double bac=(b*b)-(4*a*c);
		double sq=Math.sqrt(bac);
		if(bac>0)
		{
			double x=((-b)+sq)/(2*a);
			double x1=((-b)-sq)/(2*a);
			System.out.println("The roots of the quadratic equations are: "+x+" , "+x1);
		}
		else if(bac==0)
		{
			double x=(-b)/(2*a);
			double x1=x;
			System.out.println("The roots of the quadratic equations are: "+x+" , "+x1);
		}
		else
		{
			double sq1=Math.sqrt(-bac);
			double x=(-b)/(2*a);
			double x1=sq1/(2*a);
			System.out.printf("The roots of the quadratic equations are: %.2f+%.2fi",x,x1);
			System.out.printf("and %.2f-%.2fi",x,x1);
		}
	}
}