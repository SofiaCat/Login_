package cn.itcast.test;

import java.util.Scanner;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.game.UserGame;
import cn.itcast.pojo.User;

/**
 * 这是用户测试类
 * @author 几斗大大
 * @version v1.0
 *
 */
public class UserTest {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(true){
	System.out.println("--------欢迎---------");
	System.out.println("1.登陆");
	System.out.println("2.注册");
	System.out.println("3.取消");
	System.out.println("请做出你的选择：");
	String choose=sc.nextLine();
	UserDao ud = new UserDaoImpl();//多态
	
		switch (choose) {
		case "1":
			System.out.println("欢迎登陆");
			System.out.println("用户名：");
			String username = sc.nextLine();
			System.out.println("密码：");
			String password = sc.nextLine();
			//调用登陆功能
			boolean flag=ud.isLogin(username, password);
			if(flag){
				System.out.println("你想玩游戏么？ y/n");
				while(true){
					String chooseyn=sc.nextLine();
					if(chooseyn.equals("y")){
						UserGame.start();
						System.out.println("你想玩游戏么？ y/n");
					}else{
						break;
					}
				}
			    System.out.println("欢迎下次使用！");
			    System.exit(0);
			    //这里写break指的是退出switch
			}else{
				System.out.println("用户名或密码输入错误！");
			}
			break;
		case "2":
			System.out.println("欢迎注册");
			System.out.println("用户名：");
			String newusername = sc.nextLine();
			System.out.println("密码：");
			String newpassword = sc.nextLine();
			//把对象信息封装在User
			User user=new User();
			user.setPassword(newpassword);
			user.setUsername(newusername);
			//调用注册功能
			ud.regist(user);
			System.out.println("注册成功！");
			break;
		case "3":

		default:
			System.out.println("希望下次再遇见你！");
			System.exit(0);
			break;
			
			
		}
	}
}
}
