/*36. Implement a Program in Java to check whether a number is a Keith Number or not*/
class Keith_number{
	public static void main(String args[]){
		int num = Integer.parseInt(args[0]);
		int temp = num;
		int[] a1 = new int[50];
		int[] a2 = new int[50];
		int length = String.valueOf(num).length();

		int sum = 0, i, j = 0; 
		for(i = 0; num > 0; i++){
			a1[i] = num % 10;
			num = num / 10;
		}
		i--;
		while(i >= 0){
			a2[j] = a1[i];
			System.out.println(a2[j]);
			i--; j++;
		}
		j = length - 1;
		while(sum < temp){
			sum = 0;
			for(i = 0; i < length; i++){
				sum = a2[j - i] + sum;
			}
			j++;
			a2[j] = sum;
			System.out.println(a2[j]);
			
			if(sum == temp){
				System.out.println("Keith number");
				return;
			}
		}
		System.out.println("Not a Keith number");

	}
}