package Driver;

import Util.ResultMessage;
import Vo.BookVO;
import Vo.BorrowItemVO;
import Vo.UndergraduateVO;
import Vo.UserVO;
import bl.AdminManagebl.SystemAdminManagebl;

import java.util.ArrayList;

public class AdminManageDriver {

    public void adminCreateUserInfo(){
        UserVO uservo = new UndergraduateVO("user1","dsz","nan","12",2,5);
        SystemAdminManagebl sysAmbl = new SystemAdminManagebl();
        ResultMessage rmg = sysAmbl.createUserInfo(uservo);
        if(rmg == ResultMessage.SUCCESS){
            System.out.println("创建用户信息成功");
        }
        else{
            System.out.println("创建用户信息失败");
        }
    }

    public void adminSearchUserInfo(){
        SystemAdminManagebl sysAmbl = new SystemAdminManagebl();
        UserVO uservo = sysAmbl.searchUserInfo("user1");
        if(uservo != null){
            System.out.println("搜索 user1 的结果为: 编号" + "user1" + ", 姓名" + uservo.getName() + ", 性别" + uservo.getSexual() + ", 已借" + uservo.getBorrowedNum() + "本");
        }
        else{
            System.out.println("未搜索到 user1 用户");
        }
    }

    public void adminEditBookInfo(){
        BookVO bookvo = new BookVO("book1","《软件工程与计算1》",false);
        SystemAdminManagebl sysAmbl = new SystemAdminManagebl();
        ResultMessage rmg = sysAmbl.editBookInfo(bookvo);
        if(rmg == ResultMessage.SUCCESS){
            System.out.println("编辑书籍信息成功");
        }
        else{
            System.out.println("编辑书籍信息失败");
        }
    }

    public void adminEditUserInfo(){
        UserVO uservo = new UndergraduateVO("user1","dsz","nan","12",2,5);
        SystemAdminManagebl sysAmbl = new SystemAdminManagebl();
        ResultMessage rmg = sysAmbl.editUserInfo(uservo);
        if(rmg == ResultMessage.SUCCESS){
            System.out.println("编辑用户信息成功");
        }
        else{
            System.out.println("编辑用户信息失败");
        }
    }

    public void adminReportBorrowRecords(){
        SystemAdminManagebl sysAmbl = new SystemAdminManagebl();
        ArrayList<BorrowItemVO> blist = sysAmbl.reportBorrowRecords();

        System.out.println("编号 | userID | bookID | 借书时间 | 到期时间 | 归还时间");
        for(int i = 0;i < blist.size();i++){
            System.out.println(blist.get(i).getId() + ", " + blist.get(i).getUserID() + ", " + blist.get(i).getBookID() + ", " + blist.get(i).getBorrowTime() + ", " + blist.get(i).getDueTime() + ", " + blist.get(i).getReturnTime());
        }
    }

    public void adminReportOverduePayments(){
        SystemAdminManagebl sysAmbl = new SystemAdminManagebl();
        ArrayList<BorrowItemVO> blist = sysAmbl.reportOverduePayments();

        System.out.println("编号 | userID | bookID | 借书时间 | 到期时间 | 归还时间 | 滞纳金");
        for(int i = 0;i < blist.size();i++){
            System.out.println(blist.get(i).getId() + ", " + blist.get(i).getUserID() + ", " + blist.get(i).getBookID() + ", " +  blist.get(i).getBorrowTime() + ", " + blist.get(i).getDueTime() + ", " + blist.get(i).getReturnTime() + ", " + "￥0.20");
        }
    }

}
