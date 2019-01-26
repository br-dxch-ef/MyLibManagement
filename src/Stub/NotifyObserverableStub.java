package Stub;

import Util.ResultMessage;
import Vo.SystemAdminVO;
import bl.Notifybl.Observerable;

import java.util.List;

public class NotifyObserverableStub implements Observerable {
    private List<SystemAdminVO> list;
    @Override
    public ResultMessage addObserver(SystemAdminVO systemAdminVO) {
        //SystemAdminVO systemAdminVO1=new SystemAdminVO(systemAdminVO.ID,systemAdminVO.password);
        //list.add(systemAdminVO1);
        System.out.println("增加系统管理员成功");
        return ResultMessage.SUCCESS;
    }

    @Override
    public ResultMessage removeObserver(SystemAdminVO systemAdminVO) {
        //SystemAdminVO systemAdminVO2=new SystemAdminVO(systemAdminVO.ID,systemAdminVO.password);
        //list.remove(systemAdminVO2);
        System.out.println("删除系统管理员成功");
        return ResultMessage.SUCCESS;
    }

    @Override
    public ResultMessage notifyObserver() {
        System.out.println("通知系统管理员成功");
        return ResultMessage.SUCCESS;
    }
}
