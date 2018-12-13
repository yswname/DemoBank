package cn.com.demo.ssm.bank.respository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;

import cn.com.demo.ssm.bank.entity.BankCustomerInfo;
import cn.com.demo.ssm.bank.mapper.BankCustomerInfoMapper;
import cn.com.demo.ssm.bank.respository.IBankCustomerInfoRespository;

@Service(
		version="${dubbo.service.version}",
		application="${dubbo.application.id}",
		protocol="${dubbo.protocol.id}",
		registry="${dubbo.registry.id}"
		)
public class BankCustomerInfoRespositoryImpl implements IBankCustomerInfoRespository {
	@Autowired
    private BankCustomerInfoMapper customerMapper;
	@Override
	public BankCustomerInfo addCustomerInfo(BankCustomerInfo customer) {
		BankCustomerInfo info = null;
		int count = this.customerMapper.insert(customer);
		if(count > 0) {
			info = customer;
		}
		return info;
	}

	@Override
	public List<BankCustomerInfo> selectAllCustomer() {
		return this.customerMapper.selectByExample(null);
	}

}
