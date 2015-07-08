package day3;

public class demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator c1=new Calculator();
Calculator c2=new Calculator();
c1.a();
System.out.println(c2.num1);
System.out.println(c2.num2);
	}

}
class Calculator{
	static int num1=1;
	int num2=2;
	void a(){
		num1=9;
		num2=10;
	
	}
}
