package com.ezen.test.repository;

import com.ezen.test.domain.MemberVO;

public interface MemberDAO {

	MemberVO getUser(String id);

	int insert(MemberVO mvo);

	void LastLoginUpdate(String id);

	void update(MemberVO mvo);

	void delete(String string);

}
