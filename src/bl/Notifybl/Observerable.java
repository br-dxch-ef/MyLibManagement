package bl.Notifybl;

import Util.ResultMessage;
import Vo.SystemAdminVO;

/***
 * 抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 */

public interface Observerable {
    public ResultMessage addObserver(SystemAdminVO systemAdminVO);
    public ResultMessage removeObserver(SystemAdminVO systemAdminVO);
    public ResultMessage notifyObserver();
}
