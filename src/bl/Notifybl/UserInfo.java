package bl.Notifybl;

import Util.ResultMessage;
import Vo.SystemAdminVO;

public class UserInfo implements Observerable{

    @Override
    public ResultMessage addObserver(SystemAdminVO systemAdminVO) {
        return ResultMessage.SUCCESS;
    }

    @Override
    public ResultMessage removeObserver(SystemAdminVO systemAdminVO) {
        return ResultMessage.SUCCESS;
    }

    @Override
    public ResultMessage notifyObserver() {
        return ResultMessage.SUCCESS;
    }
}
