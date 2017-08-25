package com.company.service.iservice;

import com.company.dao.pojo.Detail;
import com.company.dao.pojo.Login;

/* service接口设计的原则：
 * 1-必须有反馈 
 * 2-处理所有异常
 */
public interface ILoginService extends IBaseService<Login, Integer> {

	String registry(Login login, Detail detail);// 注册

	String login(Login login);// 登录验证

}
