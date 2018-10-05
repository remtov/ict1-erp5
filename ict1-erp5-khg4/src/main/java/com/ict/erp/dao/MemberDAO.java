package com.ict.erp.dao;

import java.util.List;

import com.ict.erp.dto.MemberVO;

public interface MemberDAO {
	
	public List<MemberVO> selectMember() throws Exception;
}
