package bl.Borrowbl;

import Util.ResultMessage;

public class BorrowTeacherbl extends Borrowbl {

    public ResultMessage verifyUser(String bookID,String userID){
        System.out.println("老师验证成功");
        return ResultMessage.SUCCESS;
    }
    public ResultMessage modifyBorrowInfo(String bookID,String userID){
        System.out.println("老师借书成功");
        return ResultMessage.SUCCESS;
    }
}
