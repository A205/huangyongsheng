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
			
			System.out.println("1.����1��ѧ��");
			System.out.println("2.��ʾ����ѧ��");
			System.out.println("3.�˳�����");
			System.out.println("������ѡ��1-3��");
			
			
			BufferedReader br=new BufferedReader(new 
	InputStreamReader(System.in));
			
			String str="";
			int i=0;
			
			try{
				str=br.readLine();
				i=Integer.parseInt(str);
			}catch(IOException e){
			
			}catch(NumberFormatException e1){
				System.out.println("�������");
				continue;
			}
			
			
			switch(i){
				case 1:System.out.println("hello ��������1��ѧ��");break;
				case 2:System.out.println("hello ������ʾ����ѧ��");break;
	
				case 3:System.out.println("hello �����˳�����");break;
	
				
			}
			}
		}

}
