package bl.Notifybl;

import Util.ResultMessage;
import Vo.UserVO;

public class Admin implements Observer{
    @Override
    public ResultMessage update(UserVO userVO) {
        return ResultMessage.SUCCESS;
    }
}
