package cn.com.demo.ssm.bank.respository;

import java.util.List;

import cn.com.demo.ssm.bank.entity.BankCustomerInfo;

public interface IBankCustomerInfoRespository {
	/**
	 * 添加一个444用户4444信息
	 * */
    public BankCustomerInfo addCustomerInfo(BankCustomerInfo customer);
    /**
     * 查询所有的用户列表
     * */
    public List<BankCustomerInfo> selectAllCustomer();
}
