package Stub;

import Vo.SystemAdminVO;
import bl.Notifybl.Observerable;

public class NotifyObserverableStub implements Observerable {
    @Override
    public void addObserver(SystemAdminVO systemAdminVO) {
    }

    @Override
    public void removeObserver(SystemAdminVO systemAdminVO) {
    }

    @Override
    public void notifyObserver() {
    }
}
