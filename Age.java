/*42. If the total ages of Iqbal and Shikhar is 12 years more than the total age of Shikhar and Charu. Charu is how many years younger than Iqbal?
 Genera*/
 
 class Age{
	 
	 public static void main(String args[]){
		 
		 int Iqbal=Integer.parseInt(args[0]);
		 int Shikhar=Integer.parseInt(args[1]);
		 int Charu=Iqbal-12;
		 
		 
		 
		 System.out.println("charu is 12 years younger tham Iqbal and  her age is "+Charu);
		 
		 int age_1=Iqbal+Shikhar;
		 int age_2=Shikhar+Charu;
		 
		 System.out.println(age_1+" "+age_2);
		 
	 }
 }