package com.campus.myapp.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.campus.myapp.dao.CodyDAO;
import com.campus.myapp.vo.CodyVO;

@Service
public class CodyServiceImpl implements CodyService {
	@Inject
	CodyDAO dao;

	@Override
	public List<CodyVO> codyRecommend(int temp, String sex) {
		return dao.codyRecommend(temp, sex);
	}

	@Override
	public int codyInsert(CodyVO vo) {
		return dao.codyInsert(vo);
	}

	@Override
	public Integer cnameCheck(String cname) {
		return dao.cnameCheck(cname);
	}

	@Override
	public List<CodyVO> codyListAll() {
		return dao.codyListAll();
	}

	@Override
	public List<CodyVO> codyGenderList(String sex) {
		return dao.codyGenderList(sex);
	}

	@Override
	public List<CodyVO> codyStyleList(String style, String sex) {
		return dao.codyStyleList(style, sex);
	}
}
