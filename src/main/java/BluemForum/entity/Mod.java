package BluemForum.entity;

public class Mod {
    private Integer ModId;
    private String ModName;
    private String ModAccount;
    private String ModPassword;

    public Integer getModId() {
        return ModId;
    }

    public void setModId(Integer modId) {
        ModId = modId;
    }

    public String getModName() {
        return ModName;
    }

    public void setModName(String modName) {
        ModName = modName;
    }

    public String getModAccount() {
        return ModAccount;
    }

    public void setModAccount(String modAccount) {
        ModAccount = modAccount;
    }

    public String getModPassword() {
        return ModPassword;
    }

    public void setModPassword(String modPassword) {
        ModPassword = modPassword;
    }
}
