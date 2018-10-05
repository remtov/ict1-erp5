package com.ict.erp.service;

import java.util.List;

import com.ict.erp.dto.MemberVO;

public interface MemberService {
	
	public List<MemberVO> selectMember() throws Exception;
}
