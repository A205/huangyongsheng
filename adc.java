
public class adc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[][] arr = new int[20][5];
		  int[] sum = new int[20];// ���ÿ��ѧ�����ܷ�
		  int[] total = new int[5];
		  int i, j, k = 0;
		  for (i = 0; i < 20; i++)
		   for (j = 0; j < 5; j++)// ��ʼ������
		   {
		    arr[i][j] = (int) (Math.random() * 100);
		   }
		  // **********************���ѧԱ��ÿ�ſγ̵ĳɼ�************************
		  System.out.println("                       ѧ���ɼ�");
		  System.out
		    .println("    core C++  coreJava    Servlet     JSP     EJB ");
		  for (i = 0; i < 20; i++) {
		   System.out.print(i + "�� ");
		   for (j = 0; j < 5; j++) {
		    System.out.print(arr[i][j] + "         ");
		   }
		   System.out.println();
		  }
		  // ***********************ÿ��ѧԱ���ܷ�***********************
		  for (i = 0; i < 20; i++) {
		   for (j = 0; j < 5; j++) {
		    sum[i] += arr[i][j];
		   }
		   System.out.println(i + "��ѧ���ܷ֣�" + sum[i]);
		  }
		  // ******************����ѧԱ��ĳ�ſγ̵�ƽ����*****************
		  System.out.println("core C++   coreJava    Servlet    JSP     EJB");
		  for (i = 0; i < 5; i++) {
		   for (j = 0; j < 20; j++) {
		    total[i] += arr[i][i];
		   }
		   System.out.print("       " + total[i] / 20);
		  }
		 }
}
