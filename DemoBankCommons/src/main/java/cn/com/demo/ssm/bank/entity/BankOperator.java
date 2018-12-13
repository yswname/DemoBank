package cn.com.demo.ssm.bank.entity;

import java.io.Serializable;

public class BankOperator  implements Serializable{
    private Integer opId;

    private String opUserName;

    private String opPassword;

    private Integer opStatus;

    public Integer getOpId() {
        return opId;
    }

    public void setOpId(Integer opId) {
        this.opId = opId;
    }

    public String getOpUserName() {
        return opUserName;
    }

    public void setOpUserName(String opUserName) {
        this.opUserName = opUserName == null ? null : opUserName.trim();
    }

    public String getOpPassword() {
        return opPassword;
    }

    public void setOpPassword(String opPassword) {
        this.opPassword = opPassword == null ? null : opPassword.trim();
    }

    public Integer getOpStatus() {
        return opStatus;
    }

    public void setOpStatus(Integer opStatus) {
        this.opStatus = opStatus;
    }
}