package com.ccy.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccy.po.Bill;
import com.ccy.service.BillService;

@Controller
@RequestMapping("/bill")
public class Billcontroller {
	//aaaaa
	@Resource
	private BillService billService;
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<Bill> bills = billService.bills();
		model.addAttribute("bill", bills);
		return "list";
	}
	
	
	
	

}
