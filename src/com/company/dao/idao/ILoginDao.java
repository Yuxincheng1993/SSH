package com.company.dao.idao;

import com.company.dao.pojo.Detail;
import com.company.dao.pojo.Login;

public interface ILoginDao extends IBaseDao<Login,Integer> {
	//类似于CUD操作
	void registry(Login login, Detail detail)throws Exception;
	//类似于findById操作
	Login login(Login login)throws Exception;// 登录验证
	
}
