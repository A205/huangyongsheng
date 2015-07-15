
public class adc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[][] arr = new int[20][5];
		  int[] sum = new int[20];// 存放每个学生的总分
		  int[] total = new int[5];
		  int i, j, k = 0;
		  for (i = 0; i < 20; i++)
		   for (j = 0; j < 5; j++)// 初始化数组
		   {
		    arr[i][j] = (int) (Math.random() * 100);
		   }
		  // **********************输出学员的每门课程的成绩************************
		  System.out.println("                       学生成绩");
		  System.out
		    .println("    core C++  coreJava    Servlet     JSP     EJB ");
		  for (i = 0; i < 20; i++) {
		   System.out.print(i + "号 ");
		   for (j = 0; j < 5; j++) {
		    System.out.print(arr[i][j] + "         ");
		   }
		   System.out.println();
		  }
		  // ***********************每个学员的总分***********************
		  for (i = 0; i < 20; i++) {
		   for (j = 0; j < 5; j++) {
		    sum[i] += arr[i][j];
		   }
		   System.out.println(i + "号学生总分：" + sum[i]);
		  }
		  // ******************所有学员的某门课程的平均分*****************
		  System.out.println("core C++   coreJava    Servlet    JSP     EJB");
		  for (i = 0; i < 5; i++) {
		   for (j = 0; j < 20; j++) {
		    total[i] += arr[i][i];
		   }
		   System.out.print("       " + total[i] / 20);
		  }
		 }
}
