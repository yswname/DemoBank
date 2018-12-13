package cn.com.demo.ssm.bank.mapper;

import cn.com.demo.ssm.bank.entity.BankAccount;
import cn.com.demo.ssm.bank.entity.BankAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankAccountMapper {
    long countByExample(BankAccountExample example);

    int deleteByExample(BankAccountExample example);

    int deleteByPrimaryKey(String accCode);

    int insert(BankAccount record);

    int insertSelective(BankAccount record);

    List<BankAccount> selectByExample(BankAccountExample example);

    BankAccount selectByPrimaryKey(String accCode);

    int updateByExampleSelective(@Param("record") BankAccount record, @Param("example") BankAccountExample example);

    int updateByExample(@Param("record") BankAccount record, @Param("example") BankAccountExample example);

    int updateByPrimaryKeySelective(BankAccount record);

    int updateByPrimaryKey(BankAccount record);
}