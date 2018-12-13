package cn.com.demo.ssm.bank.mapper;

import cn.com.demo.ssm.bank.entity.BankOperateLog;
import cn.com.demo.ssm.bank.entity.BankOperateLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankOperateLogMapper {
    long countByExample(BankOperateLogExample example);

    int deleteByExample(BankOperateLogExample example);

    int deleteByPrimaryKey(Integer opLgId);

    int insert(BankOperateLog record);

    int insertSelective(BankOperateLog record);

    List<BankOperateLog> selectByExample(BankOperateLogExample example);

    BankOperateLog selectByPrimaryKey(Integer opLgId);

    int updateByExampleSelective(@Param("record") BankOperateLog record, @Param("example") BankOperateLogExample example);

    int updateByExample(@Param("record") BankOperateLog record, @Param("example") BankOperateLogExample example);

    int updateByPrimaryKeySelective(BankOperateLog record);

    int updateByPrimaryKey(BankOperateLog record);
}