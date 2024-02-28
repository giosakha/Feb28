
public class four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int data=25/0;
	System.out.println(data);
}catch (NullPointerException e) {System.out.println(e);}
 System.out.println("finally block is always executed");
System.out.println("rest of the code...");
	}

}
