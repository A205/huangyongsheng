
public class z {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i; 
     int j;
     for(j=2;j<=50;j++)
     {
    	 //��50���ڵ�����
    	 for(i=2;i<=j/2;i++)
    	 if(j%i==0)break;
    	 if(i>j/2){//��2��ʼ��j/2����������j
			 System.out.println("\t"+j+"������");
    	 }else{}//�ղ���
     }
     
	}

}
