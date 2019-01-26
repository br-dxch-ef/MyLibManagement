package Driver;

import Stub.NotifyObserverStub;
import Stub.NotifyObserverableStub;
import Vo.SystemAdminVO;
import Vo.TeacherVO;
import Vo.UserVO;
import bl.Notifybl.Observer;
import bl.Notifybl.Observerable;

public class NotifyDriver {

    //public static void main(String[] args){
    public void notifyDriver(){
        Observer observer = new NotifyObserverStub();
        Observerable observerable=new NotifyObserverableStub();
        SystemAdminVO systemAdmin1=new SystemAdminVO("systemAdmin1", "123456");
        observerable.addObserver(systemAdmin1);
        observerable.removeObserver(systemAdmin1);
        UserVO user1=new TeacherVO("user1","ccc","女","123456",3,15);
        observer.update(user1);
    }
}
