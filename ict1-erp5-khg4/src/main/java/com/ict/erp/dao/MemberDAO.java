package com.ict.erp.dao;

import java.util.List;

import com.ict.erp.vo.MemberVO;

public interface MemberDAO {
	
	public List<MemberVO> selectMember() throws Exception;
}
