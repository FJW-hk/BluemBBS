package BluemForum.entity;

public class Bank {
    private Integer BankId;
    private String BankName;
    private String BankHost;

    public String getBankHost() {
        return BankHost;
    }

    public Integer getBankId() {
        return BankId;
    }

    public void setBankId(Integer bankId) {
        BankId = bankId;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public void setBankHost(String bankHost) {
        BankHost = bankHost;
    }
}
