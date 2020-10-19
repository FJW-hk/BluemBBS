package BluemForum.entity;

public class Bank {
    private Integer bankId;
    private String bankName;
    private String bankHost;

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankHost() {
        return bankHost;
    }

    public void setBankHost(String bankHost) {
        this.bankHost = bankHost;
    }
}
