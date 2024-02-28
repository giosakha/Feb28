
public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	 int[] a = new int[5];
	 a[5] = 30/2;
}
catch(ArrayIndexOutOfBoundsException e) {System.out.println("task 2 is completed"); }
catch(ArithmeticException e) {System.out.println("task 1 is completed"); }
catch(Exception e) { System.out.println("common task completed"); }
	System.out.println("rest of the code");
	}

}
