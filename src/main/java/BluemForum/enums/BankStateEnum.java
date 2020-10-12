package BluemForum.enums;


public class BankStateEnum {

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
