import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class op {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
			
			System.out.println("1.增加1个学生");
			System.out.println("2.显示所有学生");
			System.out.println("3.退出程序");
			System.out.println("请输入选择（1-3）");
			
			
			BufferedReader br=new BufferedReader(new 
	InputStreamReader(System.in));
			
			String str="";
			int i=0;
			
			try{
				str=br.readLine();
				i=Integer.parseInt(str);
			}catch(IOException e){
			
			}catch(NumberFormatException e1){
				System.out.println("输入错误");
				continue;
			}
			
			
			switch(i){
				case 1:System.out.println("hello 你了增加1个学生");break;
				case 2:System.out.println("hello 你了显示所有学生");break;
	
				case 3:System.out.println("hello 你了退出程序");break;
	
				
			}
			}
		}

}
