package com.ict.erp.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ict.erp.dao.MemberDAO;
import com.ict.erp.dto.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDAO dao;
	
	@Override
	public List<MemberVO> selectMember() throws Exception {

		return dao.selectMember();
	}

}
