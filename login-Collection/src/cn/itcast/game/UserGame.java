package cn.itcast.game;

import java.util.Scanner;

/**
 * 这是猜数字小游戏
 * @author 几斗大大
 * @version v1.0
 *
 */
public class UserGame {
   public static void start() {
	Scanner sc=new Scanner(System.in);
	
	int count=0;
	int gassnum=(int)(Math.random()*100)+1;
	while(true){
		System.out.println("请输入1-100之间的数：");
		int num=sc.nextInt();
		count++;
		if(num<gassnum){
			System.out.println("你猜小了！");
		}else if(num>gassnum){
			System.out.println("你猜大了！");
		}else{
			System.out.println("猜了"+count+"次，恭喜你猜对了！");
			break;
		}
	}
}
}
