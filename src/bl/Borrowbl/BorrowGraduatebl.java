package bl.Borrowbl;

import Util.ResultMessage;

public class BorrowGraduatebl extends Borrowbl {
    public ResultMessage verifyUser(String bookID,String userID){
        System.out.println("研究生验证成功");
        return ResultMessage.SUCCESS;
    }
    public ResultMessage modifyBorrowInfo(String bookID,String userID){
        System.out.println("研究生借书成功");
        return ResultMessage.SUCCESS;
    }

}
