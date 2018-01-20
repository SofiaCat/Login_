package cn.itcast.dao;

import cn.itcast.pojo.User;

/**
 * 这是用户操作的接口
 * @author 几斗大大
 * @version v1.0
 *
 */
public interface UserDao {
	/**
	 * 这是登陆的接口
	 * @param username
	 *        用户名
	 * @param password
	 *        密码
	 * @return 返回是否登陆成功
	 */
       public abstract boolean isLogin(String username,String password);
       /**
        * 这是注册的接口
        * @param user
        *       要注册的信息
        */
       public abstract void regist(User user);
       
}
