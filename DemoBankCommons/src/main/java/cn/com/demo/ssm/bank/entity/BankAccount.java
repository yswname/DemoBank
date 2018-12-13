package cn.com.demo.ssm.bank.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class BankAccount implements Serializable{
    private String accCode;

    private Integer cmId;

    private BigDecimal accMoney;

    private String accPassword;

    public String getAccCode() {
        return accCode;
    }

    public void setAccCode(String accCode) {
        this.accCode = accCode == null ? null : accCode.trim();
    }

    public Integer getCmId() {
        return cmId;
    }

    public void setCmId(Integer cmId) {
        this.cmId = cmId;
    }

    public BigDecimal getAccMoney() {
        return accMoney;
    }

    public void setAccMoney(BigDecimal accMoney) {
        this.accMoney = accMoney;
    }

    public String getAccPassword() {
        return accPassword;
    }

    public void setAccPassword(String accPassword) {
        this.accPassword = accPassword == null ? null : accPassword.trim();
    }
}