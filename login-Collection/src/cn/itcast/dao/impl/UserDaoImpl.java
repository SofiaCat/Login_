package cn.itcast.dao.impl;
import java.util.ArrayList;

/**
 * �����û������ľ���ʵ���ࣨ���ϰ棩
 * @author �������
 * @version v1.0
 */
import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;

public class UserDaoImpl implements UserDao {
     //Ϊ�������з�������ʹ��ͬһ���ϣ����԰Ѽ�����Ϊ��Ա����
	//Ϊ�˲������˿���ʹ��private
	//Ϊ��ʹ������һ�����ϣ�����ʹ��static
    private static ArrayList <User> array=new ArrayList<User>();
	
	public boolean isLogin(String username, String password) {
		boolean flag=false;
		for(User user:array){
			if(user.getUsername().equals(username)&&user.getPassword().equals(password)){
				flag=true;
				break;
			}
		}
		return flag;
	}

	public void regist(User user) {
		array.add(user);

	}

}
