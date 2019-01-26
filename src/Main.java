import Driver.BorrowDriver;
import Driver.NotifyDriver;

public class Main {
    public static void main(String[] arg){
        NotifyDriver notifyDriver = new NotifyDriver();
        notifyDriver.notifyDriver();
        BorrowDriver borrowDriver=new BorrowDriver();
        borrowDriver.borrow();
    }
}
