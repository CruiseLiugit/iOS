package demoDay03;

import java.util.Random;

public class Example3 {

	/**
	 * @author 
	 * 
	 * 定义一个int型的一维数组，包含40个元素，用来存储每个学员的成绩，循环产生40个
	 * 0~100之间的随机整数，将它们存储到一维数组中，然后统计成绩低于平均分的学员的 人数，并输出出来。
	 */
	public static void main(String[] args) {
		int number = 40;
		int[] stu = new int[number];
		float count = 0;
		float average;

		Random r = new Random(); // 随机数函数
		for (int i = 0; i < number; i++) {
			stu[i] = r.nextInt(100);
			count += stu[i];
		}
		average = count / number;
		System.out.println("平均分为：" + average);
		for (int i = 0; i < stu.length; i++) {

			if (stu[i] < average) {
				System.out.print(stu[i] + "\t");
			}
		}
	}

}
