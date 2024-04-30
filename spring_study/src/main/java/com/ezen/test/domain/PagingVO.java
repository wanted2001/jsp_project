package com.ezen.test.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class PagingVO {
	//select * from board limit 0,10;
	// paging / qty
	//검색 -> type -> ketword 
	private int pageNo;
	private int qty; // 한화면에 보여질 목록 개수
	
	private String type;
	private String keyword;
	
	public PagingVO() {
		this.pageNo = 1;
		this.qty = 10;
	}
	
	public int getPageStart() {
		// DB 상에서 limit 의 시작 번지를 구하는 메서드
		// 1=10 2=20 3=30
		return (this.pageNo-1)*this.qty;
	}
	
	//여러가지의 타입을 같이 검색하기 위해서 타입을 배열로 구현
	public String[] getTypeToArray() {
		return this.type == null ? new String[] {} : this.type.split("");
	}
	
	
	
}
