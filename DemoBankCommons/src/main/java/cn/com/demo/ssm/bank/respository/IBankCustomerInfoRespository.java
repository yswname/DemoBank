package cn.com.demo.ssm.bank.respository;

import java.util.List;

import cn.com.demo.ssm.bank.entity.BankCustomerInfo;

public interface IBankCustomerInfoRespository {
	/**
	 * 添加一个用户信息
	 * */
    public BankCustomerInfo addCustomerInfo(BankCustomerInfo customer);
    public List<BankCustomerInfo> selectAllCustomer();
}
