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

伪代码：程序员分析的过程，半文字、半代码的方式编写的代码。
看上去像，但是不能运行。


定义一个int型的一维数组，包含40个元素，用来存储每个学员的成绩，
循环产生40个 0~100之间的随机整数，将它们存储到一维数组中，
然后统计成绩低于平均分的学员的 人数，并输出出来。

(1)定义一个数组
   var arr = new Array();
   var arr = [];
(2)存放 40 个学员成绩,确保数组中有 40 个值
   里面全部存入 0
   for(var i=0;i<40;i++){
	arr[i] = 0;
   }
   
   for(var i=0;i<40;arr[i++]=0) ;
(3)产生随机数
   var num = Math.round((Math.random()*100));

(4)把 (2)(3)两个步骤合并
  for(var i=0;i<40;i++){
        var num = Math.round((Math.random()*100));
	arr[i] = num;
   }
(5)根据 40 个成绩，得出平均数
   var ave = 0;    //平均数
   var sum = 0;    //和
   for(var i=0;i<40;i++){
      //每次循环，从数组中取出一个值
      var a = arr[i];
      //把每次循环得到的值相加，求和
      sum = sum + a;
   }
   //代码运行到这里，sum 是和
   avg = sum / arr.length;
(6)把每个人的成绩与平均数比较，小的打印
   var person_number = 0;  //保存人数值

   for(var i=0;i<40;i++){
	var a = arr[i]; //每个人的成绩
        //跟平均成绩比较
        if(a < avg){
             //统计人数值
             person_number ++; 
             //打印输出
             console.log(a);
        }
   }   

    //最后，输出小于平均数的值
    console.log(person_number);

(7)优化代码，合并 (4) (5) 两步
   var ave = 0;    //平均数
   var sum = 0;    //和
   for(var i=0;i<40;i++){
      var num = Math.round((Math.random()*100));
      arr[i] = num;

      //把每次循环得到的值相加，求和
      sum = sum + arr[i];
   }
   //代码运行到这里，sum 是和
   avg = sum / arr.length;

(8) 合并 (6) 代码
   var ave = 0;    //平均数
   var sum = 0;    //和
   var person_number = 0;  //保存人数值

   for(var i=0;i<40;i++){
      var num = Math.round((Math.random()*100));
      arr[i] = num;

      //把每次循环得到的值相加，求和
      sum = sum + arr[i];
   }
   //代码运行到这里，sum 是和
   avg = sum / arr.length;
    
   for(var i=0;i<40;i++){
	var a = arr[i]; //每个人的成绩
        //跟平均成绩比较
        if(a < avg){
             //统计人数值
             person_number ++; 
             //打印输出
             console.log(a);
        }
   }   

    //最后，输出小于平均数的值
    console.log(person_number);

