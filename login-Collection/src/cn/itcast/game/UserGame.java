package cn.itcast.game;

import java.util.Scanner;

/**
 * ���ǲ�����С��Ϸ
 * @author �������
 * @version v1.0
 *
 */
public class UserGame {
   public static void start() {
	Scanner sc=new Scanner(System.in);
	
	int count=0;
	int gassnum=(int)(Math.random()*100)+1;
	while(true){
		System.out.println("������1-100֮�������");
		int num=sc.nextInt();
		count++;
		if(num<gassnum){
			System.out.println("���С�ˣ�");
		}else if(num>gassnum){
			System.out.println("��´��ˣ�");
		}else{
			System.out.println("����"+count+"�Σ���ϲ��¶��ˣ�");
			break;
		}
	}
}
}
