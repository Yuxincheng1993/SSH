package com.company.service.iservice;

import com.company.dao.pojo.Detail;
import com.company.dao.pojo.Login;

/* service�ӿ���Ƶ�ԭ��
 * 1-�����з��� 
 * 2-���������쳣
 */
public interface ILoginService extends IBaseService<Login, Integer> {

	String registry(Login login, Detail detail);// ע��

	String login(Login login);// ��¼��֤

}
