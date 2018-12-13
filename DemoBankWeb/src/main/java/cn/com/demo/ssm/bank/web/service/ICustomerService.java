package cn.com.demo.ssm.bank.web.service;

import java.util.List;

import cn.com.demo.ssm.bank.entity.BankCustomerInfo;

public interface ICustomerService {
    public boolean addCustomer(BankCustomerInfo customer);
    public List<BankCustomerInfo> searchCustomers();
}
