
public class Exceptiondemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int result = divide(10 , 0);
	System.out.println("Result " + result);
}catch (ArithmeticException e) {
	System.out.println("Arithemtic Exception captured " + e.getMessage());
}
	System.out.println("Program continues after throw-catch block");
	}
private static int divide(int dividend , int divisor) {
	if ( divisor==0) {
		throw new ArithmeticException(" Cannot divide by zero");
	}
	return dividend/divisor;
}
}
