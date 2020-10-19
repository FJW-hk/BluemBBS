package BluemForum.enums;

public enum BankStateEnum {
    CHECK(0, "审核中"), OFFLINE(-1, "非法店铺"), SUCCESS(1, "操作成功"), PASS(2, "通过认证"), INNER_ERROR(-1001,
            "内部系统错误");
    private int state;
    private String stateInfo;

    private BankStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }
    public static BankStateEnum stateOf(int state) {
        for (BankStateEnum stateEnum : values()) {
            if (stateEnum.getState() == state) {
                return stateEnum;
            }
        }
        return null;
    }
    public int getState(){return state;}
    public String getStateInfo(){return stateInfo;}
}
