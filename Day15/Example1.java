import java.util.Random;

/**
 * 
 * ����һ��int�͵�һά���飬����10��Ԫ�أ��ֱ�һЩ���������Ȼ���������Ԫ��
 * �����ֵ����Сֵ��ƽ��ֵ����ֵ�������������
 */
public class Example1 {


	public static void main(String[] args) {
		int[] data=new int[10];
		
		System.out.print("���������ʮ�������ֱ��ǣ�");
		for(int i=0;i<data.length;i++)
		{
			data[i]=(int)(Math.random()*100);
			System.out.print(data[i]+"  ");
		}
		
		System.out.println("\n�ͣ�"+arrayOperation.sum(data));
		System.out.println("ƽ��ֵ��"+arrayOperation.average(data));
		System.out.println("���ֵ��"+arrayOperation.max(data));
		System.out.println("��Сֵ��"+arrayOperation.min(data));
	}


        public static int sum(int[] a)		//���
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum += a[i];
		return sum;
	}
	
	public static double average(int[] a)		//ƽ��ֵ
	{
		return sum(a)/a.length;
	}
	
	public static int max(int[] a)		//�����ֵ
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
			if(max<a[i])
				max=a[i];
		return max;
	}
	
	public static int min(int[] a)		//����Сֵ
	{
		int min=a[0];
		for(int i=0;i<a.length;i++)
			if(min>a[i])
				min=a[i];
		return min;
	}

}
