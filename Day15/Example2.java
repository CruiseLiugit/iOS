package demoDay03;

import java.util.Random;

public class Example2 {

	/**
	 * @author 
	 * 
	 *����һ��int�͵�һά���飬����10��Ԫ�أ��ֱ�ֵΪ1~10�� Ȼ�������е�Ԫ��
   	 *����ǰ��һ��λ�ã�����a[0]=a[1],a[1]=a[2],�����һ��Ԫ�ص�ֵ��ԭ����һ��Ԫ��
         *��ֵ��Ȼ������������
	 * 
	 */
	public static void main(String[] args) {
		int number = 10;
		int []num = new int [number];
		int head; //���� ��һ��Ԫ��
		
		Random r = new Random(); // ���������
		for (int i = 0; i < number; i++) {
			num[i] = r.nextInt(100);
			System.out.print(num[i]+"\t");
		}
		System.out.println();
		head = num[0];
		for (int i = 0; i < number-1; i++) {
			num[i]=num[i+1];
		}
		num[number-1]=head;
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+"\t");
		}
	}

}
