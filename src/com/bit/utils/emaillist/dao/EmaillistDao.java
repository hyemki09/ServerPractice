package com.bit.utils.emaillist.dao;

import java.util.List;

import com.bit.utils.emaillist.vo.EmaillistVo;

// DAO ���赵
public interface EmaillistDao {
	// ��� ����
	public List<EmaillistVo> getList();
	// INSERT�� ���� �޼���
	public int insert(EmaillistVo vo);
	// DELETE�� ���� �޼���
	public int delete(Long no);
	
}
