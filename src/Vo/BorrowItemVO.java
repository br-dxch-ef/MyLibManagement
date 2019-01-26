package Vo;

public class BorrowItemVO {
    String id;  //借书记录的id

    String userID;
    String bookID;
    String borrowTime;
    String dueTime;
    String returnTime;

    public BorrowItemVO(String id,String userID,String bookID,String borrowTime,String dueTime,String returnTime){
        super();
        this.id=id;
        this.userID=userID;
        this.bookID=bookID;
        this.borrowTime=borrowTime;
        this.dueTime=dueTime;
        this.returnTime=returnTime;
    }
    public BorrowItemVO(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBorrowTime() {
        return borrowTime;
    }

    public void setBorrowTime(String borrowTime) {
        this.borrowTime = borrowTime;
    }

    public String getDueTime() {
        return dueTime;
    }

    public void setDueTime(String dueTime) {
        this.dueTime = dueTime;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

}
