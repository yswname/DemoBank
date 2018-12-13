package cn.com.demo.ssm.bank.respository.impl;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.com.demo.ssm.bank.DemoBankRespositoryStart;
import cn.com.demo.ssm.bank.entity.BankCustomerInfo;
import cn.com.demo.ssm.bank.respository.IBankCustomerInfoRespository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=DemoBankRespositoryStart.class)
public class TestBankCustomerInfoRespositoryImpl {
	@Autowired
    private IBankCustomerInfoRespository customerResp;
	@Test
	public void testAddCustomer() {
		BankCustomerInfo customer = new BankCustomerInfo();
		customer.setCmHeaderImg("testImage");
		customer.setCmName("ttest1");
		customer.setCmPhone("ttest1");
		
		BankCustomerInfo info = this.customerResp.addCustomerInfo(customer);
		Assert.assertNotNull(info);
	}
	@Test
	public void testSelectAllCustomer() {
		List<BankCustomerInfo> customerList = this.customerResp.selectAllCustomer();
		Assert.assertTrue(customerList.size()>0);
	}
}
