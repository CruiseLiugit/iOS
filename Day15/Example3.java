package demoDay03;

import java.util.Random;

public class Example3 {

	/**
	 * @author 
	 * 
	 * ����һ��int�͵�һά���飬����40��Ԫ�أ������洢ÿ��ѧԱ�ĳɼ���ѭ������40��
	 * 0~100֮�����������������Ǵ洢��һά�����У�Ȼ��ͳ�Ƴɼ�����ƽ���ֵ�ѧԱ�� �����������������
	 */
	public static void main(String[] args) {
		int number = 40;
		int[] stu = new int[number];
		float count = 0;
		float average;

		Random r = new Random(); // ���������
		for (int i = 0; i < number; i++) {
			stu[i] = r.nextInt(100);
			count += stu[i];
		}
		average = count / number;
		System.out.println("ƽ����Ϊ��" + average);
		for (int i = 0; i < stu.length; i++) {

			if (stu[i] < average) {
				System.out.print(stu[i] + "\t");
			}
		}
	}

}
