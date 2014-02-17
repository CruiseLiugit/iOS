import java.util.Random;

/**
 * 
 * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，然后求出所有元素
 * 的最大值，最小值，平均值，和值，并输出出来。
 */
public class Example1 {


	public static void main(String[] args) {
		int[] data=new int[10];
		
		System.out.print("随机产生的十个数，分别是：");
		for(int i=0;i<data.length;i++)
		{
			data[i]=(int)(Math.random()*100);
			System.out.print(data[i]+"  ");
		}
		
		System.out.println("\n和："+arrayOperation.sum(data));
		System.out.println("平均值："+arrayOperation.average(data));
		System.out.println("最大值："+arrayOperation.max(data));
		System.out.println("最小值："+arrayOperation.min(data));
	}


        public static int sum(int[] a)		//求和
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum += a[i];
		return sum;
	}
	
	public static double average(int[] a)		//平均值
	{
		return sum(a)/a.length;
	}
	
	public static int max(int[] a)		//求最大值
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
			if(max<a[i])
				max=a[i];
		return max;
	}
	
	public static int min(int[] a)		//求最小值
	{
		int min=a[0];
		for(int i=0;i<a.length;i++)
			if(min>a[i])
				min=a[i];
		return min;
	}

}
