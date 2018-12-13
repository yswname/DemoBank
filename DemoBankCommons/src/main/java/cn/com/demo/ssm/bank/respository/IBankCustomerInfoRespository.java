package cn.com.demo.ssm.bank.respository;

import java.util.List;

import cn.com.demo.ssm.bank.entity.BankCustomerInfo;

public interface IBankCustomerInfoRespository {
    public BankCustomerInfo addCustomerInfo(BankCustomerInfo customer);
    public List<BankCustomerInfo> selectAllCustomer();
}