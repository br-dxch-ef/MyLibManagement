package bl.AdminManagebl;

import Stub.AdminManageStub;
import Util.ResultMessage;
import Vo.BookVO;
import Vo.BorrowItemVO;
import Vo.UserVO;

import java.util.ArrayList;

public class SystemAdminManagebl extends AdminManagebl {

    public ResultMessage editBookInfo(BookVO bookvo){
        AdminManageStub amStub = new AdminManageStub();
        ResultMessage rmg = amStub.editBookInfo(bookvo);
        //System.out.println(rmg);

        return rmg;
    }

    public ResultMessage editUserInfo(UserVO uservo){
        AdminManageStub amStub = new AdminManageStub();
        ResultMessage rmg = amStub.editUserInfo(uservo);
        //System.out.println(rmg);

        return rmg;
    }

    //所有的借书记录报告
    public ArrayList<BorrowItemVO> reportBorrowRecords(){
        AdminManageStub amStub = new AdminManageStub();
        ArrayList<BorrowItemVO> blist = amStub.reportBorrowRecords();

        /*System.out.println("编号 | userID | bookID | 借书时间 | 到期时间 | 归还时间");
        for(int i = 0;i < blist.size();i++){
            System.out.println(blist.get(i).getId() + ", " + blist.get(i).getUserID() + ", " + blist.get(i).getBookID() + ", " + blist.get(i).getBorrowTime() + ", " + blist.get(i).getDueTime() + ", " + blist.get(i).getReturnTime());
        }*/

        return blist;
    }

    //所有的逾期记录报告
    public ArrayList<BorrowItemVO> reportOverduePayments(){
        AdminManageStub amStub = new AdminManageStub();
        ArrayList<BorrowItemVO> blist = amStub.reportOverduePayments();

        /*System.out.println("编号 | userID | bookID | 借书时间 | 到期时间 | 归还时间 | 滞纳金");
        for(int i = 0;i < blist.size();i++){
            System.out.println(blist.get(i).getId() + ", " + blist.get(i).getUserID() + ", " + blist.get(i).getBookID() + ", " +  blist.get(i).getBorrowTime() + ", " + blist.get(i).getDueTime() + ", " + blist.get(i).getReturnTime() + ", " + "￥0.20");
        }*/

        return blist;
    }

}
