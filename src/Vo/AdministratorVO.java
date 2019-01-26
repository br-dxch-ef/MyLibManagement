package Vo;

public abstract class AdministratorVO {

    public String ID;
    public String password;

    public AdministratorVO(String ID,String password){
        super();
        ID=ID;
        this.password=password;
    }
    public AdministratorVO(){}

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
