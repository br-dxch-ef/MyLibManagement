package Stub;

import Util.ResultMessage;
import Vo.BookVO;
import Vo.BorrowItemVO;
import Vo.UndergraduateVO;
import Vo.UserVO;

import java.util.ArrayList;

public class AdminManageStub {

    public ResultMessage createUserInfo(UserVO uservo){
        ResultMessage rmg = ResultMessage.FAILED;
        if(uservo != null){
            rmg = ResultMessage.SUCCESS;
        }
        return rmg;
    }

    public UserVO searchUserInfo(String userID){
        UserVO uservo = null;
        if(userID == "user1"){
            uservo = new UndergraduateVO("user1","dsz","男","12",2,5);
        }
        return uservo;
    }

    public ResultMessage editBookInfo(BookVO bookvo){
        return ResultMessage.SUCCESS;
    }

    public ResultMessage editUserInfo(UserVO uservo){
        return ResultMessage.SUCCESS;
    }

    public ArrayList<BorrowItemVO> reportBorrowRecords(){
        ArrayList<BorrowItemVO> blist = new ArrayList<BorrowItemVO>();
        blist.add(new BorrowItemVO("br001", "user2", "book2", "20181101", "20190101", "20190121"));
        blist.add(new BorrowItemVO("br002", "user3", "book3", "20181101", "20190101", "20190121"));
        blist.add(new BorrowItemVO("br003", "user1", "book1", "20190101", "20190301", "20190131"));

        return blist;
    }

    public ArrayList<BorrowItemVO> reportOverduePayments(){
        ArrayList<BorrowItemVO> blist = new ArrayList<BorrowItemVO>();
        blist.add(new BorrowItemVO("br001", "user2", "book2", "20181101", "20190101", "20190121"));
        blist.add(new BorrowItemVO("br002", "user3", "book3", "20181101", "20190101", "20190121"));

        return blist;
    }

}
