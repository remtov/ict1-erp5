package com.ict.erp.service;

import java.util.List;

import com.ict.erp.vo.MemberVO;

public interface MemberService {
	
	public List<MemberVO> selectMember() throws Exception;
}
