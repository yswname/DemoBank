package cn.com.demo.ssm.bank.web.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.com.demo.ssm.bank.entity.BankCustomerInfo;
import cn.com.demo.ssm.bank.web.service.ICustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private ICustomerService customerService = null;
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addPage() {
		return "addCustomer";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(BankCustomerInfo customer) {
		String result = "redirect:/customer/searchCustomer";
		boolean bool = this.customerService.addCustomer(customer);
		return result;
	}

	@RequestMapping(value = "/searchCustomer")
	public String customerList(Model model) {
		List<BankCustomerInfo> customerList = this.customerService.searchCustomers();
		model.addAttribute("customerList", customerList);
		return "customerList";
	}
}
