package cn.com.demo.ssm.bank.mapper;

import cn.com.demo.ssm.bank.entity.BankOperator;
import cn.com.demo.ssm.bank.entity.BankOperatorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankOperatorMapper {
    long countByExample(BankOperatorExample example);

    int deleteByExample(BankOperatorExample example);

    int deleteByPrimaryKey(Integer opId);

    int insert(BankOperator record);

    int insertSelective(BankOperator record);

    List<BankOperator> selectByExample(BankOperatorExample example);

    BankOperator selectByPrimaryKey(Integer opId);

    int updateByExampleSelective(@Param("record") BankOperator record, @Param("example") BankOperatorExample example);

    int updateByExample(@Param("record") BankOperator record, @Param("example") BankOperatorExample example);

    int updateByPrimaryKeySelective(BankOperator record);

    int updateByPrimaryKey(BankOperator record);
}