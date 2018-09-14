package com.ccy.contrller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ccy.po.Bill;
import com.ccy.service.BillService;

@Controller
@RequestMapping("/list")
public class BillContrller {
	@Resource
	private BillService billService;
	
	@RequestMapping("/bill")
	public String list(Model model) {
	 List<Bill> bills = billService.bills();
	 model.addAttribute("bill", bills);
	 return "list";
	}

}
