package com.company.dao.idao;

import java.util.List;

import com.company.dao.pojo.Emp;

public interface IEmpDao extends IBaseDao<Emp, Integer> {
	// 接口独有功能 根据商品名称进行模糊查询
	List<Emp> findByName(String ename) throws Exception;
}