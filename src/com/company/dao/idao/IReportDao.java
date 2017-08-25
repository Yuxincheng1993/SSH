package com.company.dao.idao;

import java.util.List;

import com.company.dao.pojo.report.Report;

public interface IReportDao {
	List<Report> getReportByDeptno() throws Exception;
}
