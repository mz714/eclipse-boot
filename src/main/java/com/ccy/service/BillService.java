package com.ccy.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccy.mapper.BillMapper;
import com.ccy.po.Bill;


@Service
public class BillService {
	
	@Autowired
	private BillMapper mapper;
	
	
	public List<Bill> bills(){
		
	  return  mapper.bills();
	} 

}
