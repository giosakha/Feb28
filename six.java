import java.io.IOException;
public class six {

	
void m()throws IOException {
	throw new IOException ("device error");//checked exception
}
void n()throws IOException {
	m();
	
}
void p() {
	try {
		n();
	}catch (Exception e) {System.out.println("exception headed");}
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	six obj = new six();
	obj.p();
	System.out.println("normal flow");
	}

}
