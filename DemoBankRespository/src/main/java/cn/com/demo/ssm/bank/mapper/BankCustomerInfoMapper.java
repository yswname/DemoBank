package cn.com.demo.ssm.bank.mapper;

import cn.com.demo.ssm.bank.entity.BankCustomerInfo;
import cn.com.demo.ssm.bank.entity.BankCustomerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankCustomerInfoMapper {
    long countByExample(BankCustomerInfoExample example);

    int deleteByExample(BankCustomerInfoExample example);

    int deleteByPrimaryKey(Integer cmId);

    int insert(BankCustomerInfo record);

    int insertSelective(BankCustomerInfo record);

    List<BankCustomerInfo> selectByExample(BankCustomerInfoExample example);

    BankCustomerInfo selectByPrimaryKey(Integer cmId);

    int updateByExampleSelective(@Param("record") BankCustomerInfo record, @Param("example") BankCustomerInfoExample example);

    int updateByExample(@Param("record") BankCustomerInfo record, @Param("example") BankCustomerInfoExample example);

    int updateByPrimaryKeySelective(BankCustomerInfo record);

    int updateByPrimaryKey(BankCustomerInfo record);
}