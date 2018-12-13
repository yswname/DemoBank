package cn.com.demo.ssm.bank.entity;

import java.io.Serializable;
import java.util.Date;

public class BankOperateLog  implements Serializable{
    private Integer opLgId;

    private Integer opId;

    private Date opLgTime;

    private Integer opLgType;

    private Integer opLgResult;

    private String opDesc;

    public Integer getOpLgId() {
        return opLgId;
    }

    public void setOpLgId(Integer opLgId) {
        this.opLgId = opLgId;
    }

    public Integer getOpId() {
        return opId;
    }

    public void setOpId(Integer opId) {
        this.opId = opId;
    }

    public Date getOpLgTime() {
        return opLgTime;
    }

    public void setOpLgTime(Date opLgTime) {
        this.opLgTime = opLgTime;
    }

    public Integer getOpLgType() {
        return opLgType;
    }

    public void setOpLgType(Integer opLgType) {
        this.opLgType = opLgType;
    }

    public Integer getOpLgResult() {
        return opLgResult;
    }

    public void setOpLgResult(Integer opLgResult) {
        this.opLgResult = opLgResult;
    }

    public String getOpDesc() {
        return opDesc;
    }

    public void setOpDesc(String opDesc) {
        this.opDesc = opDesc == null ? null : opDesc.trim();
    }
}