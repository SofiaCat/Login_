package cn.itcast.dao.impl;
import java.util.ArrayList;

/**
 * 这是用户操作的具体实现类（集合版）
 * @author 几斗大大
 * @version v1.0
 */
import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;

public class UserDaoImpl implements UserDao {
     //为了让所有方法都能使用同一集合，所以把集合设为成员变量
	//为了不让外人看到使用private
	//为了使对象共享一个集合，所以使用static
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
