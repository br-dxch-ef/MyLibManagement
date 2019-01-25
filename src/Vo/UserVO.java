package Vo;

import Util.ResultMessage;

public abstract class UserVO {
    String ID;

    //个人信息
    String name;
    String sexual;
    String password;

    int borrowedNum;
    int borrowMaxNum;

    public ResultMessage borrowBook(){
        ResultMessage rmg = ResultMessage.FAILED;

        ResultMessage verify_rmg = verifyUser();
        if(verify_rmg==ResultMessage.SUCCESS){
            modifyBorrowInfo();
        }
        return rmg;
    }

    public ResultMessage verifyUser(){
        return ResultMessage.SUCCESS;
    }

    public ResultMessage modifyBorrowInfo(){
        return ResultMessage.SUCCESS;
    }

}
