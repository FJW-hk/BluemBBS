package BluemForum.dto;

import BluemForum.entity.Bank;
import BluemForum.enums.BankStateEnum;

import java.util.List;

public class BankExecution {
    //板块状态
    private int state;
    //状态信息
    private String stateInfo;
    //板块数量
    private int count;
    //操作板块
    private Bank bank;
    //板块列表
    private List<Bank> bankList;

    public BankExecution() {
    }
    public BankExecution(BankStateEnum stateEnum){
        this.state=stateEnum.getState();
        this.stateInfo=stateEnum.getStateInfo();
    }
}
