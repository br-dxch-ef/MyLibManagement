package bl.AdminManagebl;

import Stub.AdminManageStub;
import Util.ResultMessage;
import Vo.UserVO;

public abstract class AdminManagebl {

    public ResultMessage createUserInfo(UserVO uservo){
        AdminManageStub amStub = new AdminManageStub();
        ResultMessage rmg = amStub.createUserInfo(uservo);
        //System.out.println(rmg);

        return rmg;
    }

    //根据用户的ID搜索
    public UserVO searchUserInfo(String userID){
        AdminManageStub amStub = new AdminManageStub();
        UserVO uservo = amStub.searchUserInfo(userID);
        //System.out.println(userID + ": " + uservo.getName() + ", " + uservo.getSexual() + ", 已借" + uservo.getBorrowedNum() + "本");

        return uservo;
    }

}
