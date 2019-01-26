package bl.Borrowbl;

import Util.ResultMessage;

public class BorrowUndergraduatebl extends Borrowbl {

    public ResultMessage verifyUser(String bookID,String userID){
        System.out.println("本科生验证成功");
        return ResultMessage.SUCCESS;
    }
    public ResultMessage modifyBorrowInfo(String bookID,String userID){
        System.out.println("本科生借书成功");
        return ResultMessage.SUCCESS;
    }
}
