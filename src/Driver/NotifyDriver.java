package Driver;

import Stub.NotifyObserverStub;
import Stub.NotifyObserverableStub;
import Vo.AdministratorVO;
import Vo.SystemAdminVO;
import Vo.UserVO;
import bl.Notifybl.Admin;
import bl.Notifybl.Observer;
import bl.Notifybl.Observerable;

public class NotifyDriver {
    Observer observer = new NotifyObserverStub();
    Observerable observerable=new NotifyObserverableStub();
    public static void main(String[] args){
        AdministratorVO systemAdmin1=new SystemAdminVO("systemAdmin1", "123456");
    }
}
