package huangyongsheng;

import java.util.Scanner;

public class x {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("...");
		int score=scanner.nextInt();
// TODO Auto-generated method stub
if(score>90)
	System.out.println("A");
	else if(score>=80)
		System.out.println("B");
	else if(score>=60)
	System.out.println("C");
	else
		System.out.println("F");
	}

}
