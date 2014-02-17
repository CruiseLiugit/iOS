package demoDay03;

import java.util.Random;

public class Example2 {

	/**
	 * @author 
	 * 
	 *定义一个int型的一维数组，包含10个元素，分别赋值为1~10， 然后将数组中的元素
   	 *都向前移一个位置，即，a[0]=a[1],a[1]=a[2],…最后一个元素的值是原来第一个元素
         *的值，然后输出这个数组
	 * 
	 */
	public static void main(String[] args) {
		int number = 10;
		int []num = new int [number];
		int head; //储存 第一个元素
		
		Random r = new Random(); // 随机数函数
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
