package com.company.dao.idao;

import com.company.dao.pojo.Detail;
import com.company.dao.pojo.Login;

public interface ILoginDao extends IBaseDao<Login,Integer> {
	//������CUD����
	void registry(Login login, Detail detail)throws Exception;
	//������findById����
	Login login(Login login)throws Exception;// ��¼��֤
	
}
