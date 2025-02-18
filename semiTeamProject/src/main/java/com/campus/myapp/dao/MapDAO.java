package com.campus.myapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.campus.myapp.vo.Paging10VO;
import com.campus.myapp.vo.ReviewVO;
import com.campus.myapp.vo.StoreVO;


@Mapper
@Repository
public interface MapDAO {
	
	//���� ���� ���� ���� ���
	public List<ReviewVO> myReviewListAll(String userid);
	
	//���� ���� ����
	public int myreviewDeleteOk(int reviewno);

	//�������� ���
	public int addplace(StoreVO vo);	
	
	//�������� �������
	public List<ReviewVO> reviewListAll(Paging10VO vo);

	public StoreVO getStore(String id);

	//�� ���ڵ� �� ���ϱ�
	public int totalRecord(Paging10VO pvo);
	
	
	//�������,�� ���� ����
	public ReviewVO reviewCntSelectAll(String id);
	
	//������ ���� ����
	public int reviewDeleteOk(int reviewno);
	
	
	
}