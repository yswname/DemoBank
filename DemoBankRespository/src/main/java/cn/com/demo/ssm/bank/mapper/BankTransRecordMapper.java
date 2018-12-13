package cn.com.demo.ssm.bank.mapper;

import cn.com.demo.ssm.bank.entity.BankTransRecord;
import cn.com.demo.ssm.bank.entity.BankTransRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankTransRecordMapper {
    long countByExample(BankTransRecordExample example);

    int deleteByExample(BankTransRecordExample example);

    int deleteByPrimaryKey(Integer trnId);

    int insert(BankTransRecord record);

    int insertSelective(BankTransRecord record);

    List<BankTransRecord> selectByExample(BankTransRecordExample example);

    BankTransRecord selectByPrimaryKey(Integer trnId);

    int updateByExampleSelective(@Param("record") BankTransRecord record, @Param("example") BankTransRecordExample example);

    int updateByExample(@Param("record") BankTransRecord record, @Param("example") BankTransRecordExample example);

    int updateByPrimaryKeySelective(BankTransRecord record);

    int updateByPrimaryKey(BankTransRecord record);
}