/*Implement a JAVA program to check the default values of the Datatypes. */

  
class DefaultvaluesofDT_2{
	public static void main(String args[]){
		System.out.println("int : "+ (Integer.SIZE/8));
		System.out.println("Long : "+ (Long.SIZE/8));
		System.out.println("double : "+ (Double.SIZE/8));
		System.out.println("char : "+ (Character.SIZE/8));
		System.out.println("float : "+ (Float.SIZE/8));
	}
}