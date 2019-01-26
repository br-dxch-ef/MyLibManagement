package bl.Borrowbl;

import Util.ResultMessage;

public abstract class Borrowbl {

    public ResultMessage borrowBook(String bookID,String userID){
        ResultMessage rmg = ResultMessage.FAILED;

        ResultMessage verify_rmg = verifyUser(bookID,userID);
        if(verify_rmg==ResultMessage.SUCCESS){
            modifyBorrowInfo(bookID,userID);
        }
        return rmg;
    }

    //可在子类中覆盖
    public ResultMessage verifyUser(String bookID,String userID){

        return ResultMessage.SUCCESS;
    }

    //可在子类中覆盖
    public ResultMessage modifyBorrowInfo(String bookID,String userID){

        return ResultMessage.SUCCESS;
    }

}
