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

α���룺����Ա�����Ĺ��̣������֡������ķ�ʽ��д�Ĵ��롣
����ȥ�񣬵��ǲ������С�


����һ��int�͵�һά���飬����40��Ԫ�أ������洢ÿ��ѧԱ�ĳɼ���
ѭ������40�� 0~100֮�����������������Ǵ洢��һά�����У�
Ȼ��ͳ�Ƴɼ�����ƽ���ֵ�ѧԱ�� �����������������

(1)����һ������
   var arr = new Array();
   var arr = [];
(2)��� 40 ��ѧԱ�ɼ�,ȷ���������� 40 ��ֵ
   ����ȫ������ 0
   for(var i=0;i<40;i++){
	arr[i] = 0;
   }
   
   for(var i=0;i<40;arr[i++]=0) ;
(3)���������
   var num = Math.round((Math.random()*100));

(4)�� (2)(3)��������ϲ�
  for(var i=0;i<40;i++){
        var num = Math.round((Math.random()*100));
	arr[i] = num;
   }
(5)���� 40 ���ɼ����ó�ƽ����
   var ave = 0;    //ƽ����
   var sum = 0;    //��
   for(var i=0;i<40;i++){
      //ÿ��ѭ������������ȡ��һ��ֵ
      var a = arr[i];
      //��ÿ��ѭ���õ���ֵ��ӣ����
      sum = sum + a;
   }
   //�������е����sum �Ǻ�
   avg = sum / arr.length;
(6)��ÿ���˵ĳɼ���ƽ�����Ƚϣ�С�Ĵ�ӡ
   var person_number = 0;  //��������ֵ

   for(var i=0;i<40;i++){
	var a = arr[i]; //ÿ���˵ĳɼ�
        //��ƽ���ɼ��Ƚ�
        if(a < avg){
             //ͳ������ֵ
             person_number ++; 
             //��ӡ���
             console.log(a);
        }
   }   

    //������С��ƽ������ֵ
    console.log(person_number);

(7)�Ż����룬�ϲ� (4) (5) ����
   var ave = 0;    //ƽ����
   var sum = 0;    //��
   for(var i=0;i<40;i++){
      var num = Math.round((Math.random()*100));
      arr[i] = num;

      //��ÿ��ѭ���õ���ֵ��ӣ����
      sum = sum + arr[i];
   }
   //�������е����sum �Ǻ�
   avg = sum / arr.length;

(8) �ϲ� (6) ����
   var ave = 0;    //ƽ����
   var sum = 0;    //��
   var person_number = 0;  //��������ֵ

   for(var i=0;i<40;i++){
      var num = Math.round((Math.random()*100));
      arr[i] = num;

      //��ÿ��ѭ���õ���ֵ��ӣ����
      sum = sum + arr[i];
   }
   //�������е����sum �Ǻ�
   avg = sum / arr.length;
    
   for(var i=0;i<40;i++){
	var a = arr[i]; //ÿ���˵ĳɼ�
        //��ƽ���ɼ��Ƚ�
        if(a < avg){
             //ͳ������ֵ
             person_number ++; 
             //��ӡ���
             console.log(a);
        }
   }   

    //������С��ƽ������ֵ
    console.log(person_number);

