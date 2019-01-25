package bl.Borrowbl;

import Util.ResultMessage;

public abstract class Borrowbl {

    public ResultMessage borrowBook(){
        ResultMessage rmg = ResultMessage.FAILED;

        ResultMessage verify_rmg = verifyUser();
        if(verify_rmg==ResultMessage.SUCCESS){
            modifyBorrowInfo();
        }
        return rmg;
    }

    //可在子类中覆盖
    public ResultMessage verifyUser(){
        return ResultMessage.SUCCESS;
    }

    //可在子类中覆盖
    public ResultMessage modifyBorrowInfo(){
        return ResultMessage.SUCCESS;
    }

}
