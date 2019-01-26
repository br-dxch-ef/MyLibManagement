package bl.Notifybl;

import Vo.SystemAdminVO;

/***
 * 抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 */

public interface Observerable {
    public void addObserver(SystemAdminVO systemAdminVO);
    public void removeObserver(SystemAdminVO systemAdminVO);
    public void notifyObserver();
}
