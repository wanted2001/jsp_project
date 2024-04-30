package com.ezen.test.repository;

import java.util.List;

import com.ezen.test.domain.FileVO;

public interface FileDAO {

	public int insertFile(FileVO fvo);

	public List<FileVO> getFileList(int bno);

	public int removeFile(String uuid);

}
