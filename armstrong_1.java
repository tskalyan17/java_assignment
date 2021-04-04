/*Implement JAVA program to check whether a given number is ARMSTRONG or not.*/

import java.util.Scanner;

class armstrong_1{
	public static void main(String []args){
		int num,num1,j,k,c,i=0;
		int n[]=new int[100];
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the  Number");
		num=obj.nextInt();
		num1=num;
		do{					
			n[i]=num%10;
			num=num/10;
			i++;
		}while(num!=0);
		int sum=0;
		for(j=0;j<i;j++)	
		{
			c=n[j];
			for(k=0;k<i-1;k++){
				n[j]=c*n[j];
			}
			sum=sum+n[j];
		}
		if(sum==num1)	
		{
			System.out.println(num1+" is an Armstrong number");
		}
		else
		{
			System.out.println(num1+" is not an Armstrong number");
		}
	}
}