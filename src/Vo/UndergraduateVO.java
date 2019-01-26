package Vo;

public class UndergraduateVO extends UserVO {
    final static int BorrowMaxNum = 5;
    public UndergraduateVO(String ID,String name,String sexual,String password,int borrowedNum,int BorrowMaxNum){
        this.ID=ID;
        this.name=name;
        this.sexual=sexual;
        this.password=password;
        this.borrowedNum=borrowedNum;
    }

}
