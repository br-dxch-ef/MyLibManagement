package Stub;

import Util.ResultMessage;
import Vo.UserVO;
import bl.Notifybl.Observer;

public class NotifyObserverStub implements Observer {
    @Override
    public ResultMessage update(UserVO userVO) {
        System.out.println("更新用户数据成功");
        NotifyObserverableStub notifyObserverableStub=new NotifyObserverableStub();
        notifyObserverableStub.notifyObserver();
        return ResultMessage.SUCCESS;
    }
}
