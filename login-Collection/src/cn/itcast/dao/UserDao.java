package cn.itcast.dao;

import cn.itcast.pojo.User;

/**
 * �����û������Ľӿ�
 * @author �������
 * @version v1.0
 *
 */
public interface UserDao {
	/**
	 * ���ǵ�½�Ľӿ�
	 * @param username
	 *        �û���
	 * @param password
	 *        ����
	 * @return �����Ƿ��½�ɹ�
	 */
       public abstract boolean isLogin(String username,String password);
       /**
        * ����ע��Ľӿ�
        * @param user
        *       Ҫע�����Ϣ
        */
       public abstract void regist(User user);
       
}
