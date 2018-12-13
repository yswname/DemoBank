package cn.com.demo.ssm.bank.web.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.com.demo.ssm.bank.entity.BankCustomerInfo;
import cn.com.demo.ssm.bank.respository.IBankCustomerInfoRespository;
import cn.com.demo.ssm.bank.web.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {
	@Reference(application = "${dubbo.application.id}", registry = "${dubbo.registry.id}", version = "${dubbo.application.version}")
	private IBankCustomerInfoRespository customerResp;

	@Override
	public boolean addCustomer(BankCustomerInfo customer) {
		BankCustomerInfo info = this.customerResp.addCustomerInfo(customer);
		if (info == null)
			return false;
		else {
			return true;
		}
	}

	@Override
	public List<BankCustomerInfo> searchCustomers() {
		return this.customerResp.selectAllCustomer();
	}

}
