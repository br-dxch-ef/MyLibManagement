package Driver;

import Vo.*;
import bl.Borrowbl.BorrowGraduatebl;
import bl.Borrowbl.BorrowTeacherbl;
import bl.Borrowbl.BorrowUndergraduatebl;
import bl.Borrowbl.Borrowbl;

public class BorrowDriver {
    public void borrow(){
        UserVO user1=new UndergraduateVO("user1","dsz","nan","12",2,5);
        UserVO user2=new GraduateVO("user2","sfdf","nan","12",2,10);
        UserVO user3=new TeacherVO("user3","sfdf","nan","12",2,15);
        BookVO book1=new BookVO("book1","《软件工程与计算1》",false);
        BookVO book2=new BookVO("book2","《软件工程与计算2》",false);
        BookVO book3=new BookVO("book3","《软件工程与计算3》",false);
        Borrowbl borrowUndergraduate=new BorrowUndergraduatebl();
        borrowUndergraduate.borrowBook(book1.getID(),user1.getID());
        Borrowbl borrowGraduate=new BorrowGraduatebl();
        borrowGraduate.borrowBook(book2.getID(),user2.getID());
        Borrowbl borrowTeacher=new BorrowTeacherbl();
        borrowTeacher.borrowBook(book3.getID(),user3.getID());
    }


}
