package cn.com.demo.ssm.bank.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BankTransRecord  implements Serializable{
    private Integer trnId;

    private String accCode;

    private String bnkAccCode;

    private Date trnTime;

    private BigDecimal trnMoney;

    public Integer getTrnId() {
        return trnId;
    }

    public void setTrnId(Integer trnId) {
        this.trnId = trnId;
    }

    public String getAccCode() {
        return accCode;
    }

    public void setAccCode(String accCode) {
        this.accCode = accCode == null ? null : accCode.trim();
    }

    public String getBnkAccCode() {
        return bnkAccCode;
    }

    public void setBnkAccCode(String bnkAccCode) {
        this.bnkAccCode = bnkAccCode == null ? null : bnkAccCode.trim();
    }

    public Date getTrnTime() {
        return trnTime;
    }

    public void setTrnTime(Date trnTime) {
        this.trnTime = trnTime;
    }

    public BigDecimal getTrnMoney() {
        return trnMoney;
    }

    public void setTrnMoney(BigDecimal trnMoney) {
        this.trnMoney = trnMoney;
    }
}