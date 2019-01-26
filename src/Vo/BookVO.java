package Vo;

public class BookVO {
    String ID;
    String name;
    boolean isBorrowed;

    public BookVO(String ID,String name,boolean isBorrowed){
        super();
        ID=ID;
        this.name=name;
        this.isBorrowed=isBorrowed;
    }
    public BookVO(){}

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }



}
