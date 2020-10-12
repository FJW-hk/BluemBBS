package BluemForum.entity;

public class Manager {
    private Integer ManagerID;
    private String ManagerName;
    private String ManagerAccount;
    private String ManagerPassword;

    public Integer getManagerID() {
        return ManagerID;
    }

    public void setManagerID(Integer managerID) {
        ManagerID = managerID;
    }

    public String getManagerName() {
        return ManagerName;
    }

    public void setManagerName(String managerName) {
        ManagerName = managerName;
    }

    public String getManagerAccount() {
        return ManagerAccount;
    }

    public void setManagerAccount(String managerAccount) {
        ManagerAccount = managerAccount;
    }

    public String getManagerPassword() {
        return ManagerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        ManagerPassword = managerPassword;
    }
}
