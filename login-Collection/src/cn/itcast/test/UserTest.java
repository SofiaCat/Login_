package cn.itcast.test;

import java.util.Scanner;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.game.UserGame;
import cn.itcast.pojo.User;

/**
 * �����û�������
 * @author �������
 * @version v1.0
 *
 */
public class UserTest {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(true){
	System.out.println("--------��ӭ---------");
	System.out.println("1.��½");
	System.out.println("2.ע��");
	System.out.println("3.ȡ��");
	System.out.println("���������ѡ��");
	String choose=sc.nextLine();
	UserDao ud = new UserDaoImpl();//��̬
	
		switch (choose) {
		case "1":
			System.out.println("��ӭ��½");
			System.out.println("�û�����");
			String username = sc.nextLine();
			System.out.println("���룺");
			String password = sc.nextLine();
			//���õ�½����
			boolean flag=ud.isLogin(username, password);
			if(flag){
				System.out.println("��������Ϸô�� y/n");
				while(true){
					String chooseyn=sc.nextLine();
					if(chooseyn.equals("y")){
						UserGame.start();
						System.out.println("��������Ϸô�� y/n");
					}else{
						break;
					}
				}
			    System.out.println("��ӭ�´�ʹ�ã�");
			    System.exit(0);
			    //����дbreakָ�����˳�switch
			}else{
				System.out.println("�û����������������");
			}
			break;
		case "2":
			System.out.println("��ӭע��");
			System.out.println("�û�����");
			String newusername = sc.nextLine();
			System.out.println("���룺");
			String newpassword = sc.nextLine();
			//�Ѷ�����Ϣ��װ��User
			User user=new User();
			user.setPassword(newpassword);
			user.setUsername(newusername);
			//����ע�Ṧ��
			ud.regist(user);
			System.out.println("ע��ɹ���");
			break;
		case "3":

		default:
			System.out.println("ϣ���´��������㣡");
			System.exit(0);
			break;
			
			
		}
	}
}
}
