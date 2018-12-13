package cn.com.demo.ssm.bank.respository;

import java.util.List;

import cn.com.demo.ssm.bank.entity.BankCustomerInfo;

public interface IBankCustomerInfoRespository {// 4444用111戶444111
	/**
	 * 第一個人
	 * 111111
	 * 第一個人
	 * 第四個人
	 * 44444
	 * 添4444加一个444用11111户444411111信息
	 * 1111111
	 * 第四個人
	 * 44444
	 * */
    public BankCustomerInfo addCustomerInfo(BankCustomerInfo customer);
    /**
     * 查询所有的用户列表
     * */
    public List<BankCustomerInfo> selectAllCustomer();
}
