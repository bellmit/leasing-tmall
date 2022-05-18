package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.FenxiaoGrade;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.fenxiao.grades.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoGradesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7751212227866921774L;

	/** 
	 * 分销商等级信息
	 */
	@ApiListField("fenxiao_grades")
	@ApiField("fenxiao_grade")
	private List<FenxiaoGrade> fenxiaoGrades;


	public void setFenxiaoGrades(List<FenxiaoGrade> fenxiaoGrades) {
		this.fenxiaoGrades = fenxiaoGrades;
	}
	public List<FenxiaoGrade> getFenxiaoGrades( ) {
		return this.fenxiaoGrades;
	}
	


}
