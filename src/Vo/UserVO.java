package Vo;

import Util.ResultMessage;

public abstract class UserVO {
    String ID;

    //个人信息
    String name;
    String sexual;
    String password;

    int borrowedNum;

    public UserVO(String ID,String name,String sexual,String password,int borrowedNum){
        super();
        ID=ID;
        this.name=name;
        this.sexual=sexual;
        this.password=password;
        this.borrowedNum=borrowedNum;
    }
    public UserVO(){}

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexual() {
        return sexual;
    }

    public void setSexual(String sexual) {
        this.sexual = sexual;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBorrowedNum() {
        return borrowedNum;
    }

    public void setBorrowedNum(int borrowedNum) {
        this.borrowedNum = borrowedNum;
    }

}
