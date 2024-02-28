
public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	//code that may raise exception
	int data=100/0;
	System.out.println(data);
}catch(ArithmeticException e) {
	System.out.println(e);}
//rest code of the program
System.out.println("rest of the code...");
	}

}
