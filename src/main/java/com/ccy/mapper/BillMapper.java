package com.ccy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ccy.po.Bill;

@Mapper
public interface BillMapper {
	
	public List<Bill> bills();

}
