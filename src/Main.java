import Driver.AdminManageDriver;
import Driver.BorrowDriver;
import Driver.NotifyDriver;
import Driver.ReaderDriver;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg){


        //方法调用控制器
        while(true){
            System.out.println("请输入方法的编号(0退出/1借书/3读文件/21管理员创建和搜索用户/22管理员编辑书籍和用户/23管理员生成报告/4用户修改个人信息): ");
            Scanner sc = new Scanner(System.in);
            int cmd = sc.nextInt();
            if(cmd == 0){
                break;
            }
            else if(cmd == 1){
                BorrowDriver borrowDriver=new BorrowDriver();
                borrowDriver.borrow();
            }
            else if(cmd == 3){
                ReaderDriver readerDriver = new ReaderDriver();
                readerDriver.ReadWordDriver();
                readerDriver.ReadPDFDriver();
                readerDriver.ReadEPUBDriver();
            }
            else if(cmd == 21){
                AdminManageDriver adminManageDriver = new AdminManageDriver();
                adminManageDriver.adminCreateUserInfo();
                adminManageDriver.adminSearchUserInfo();
            }
            else if(cmd == 22){
                AdminManageDriver adminManageDriver = new AdminManageDriver();
                adminManageDriver.adminEditBookInfo();
                adminManageDriver.adminEditUserInfo();
            }
            else if(cmd == 23){
                AdminManageDriver adminManageDriver = new AdminManageDriver();
                adminManageDriver.adminReportBorrowRecords();
                adminManageDriver.adminReportOverduePayments();
            }
            else if(cmd == 4){
                NotifyDriver notifyDriver = new NotifyDriver();
                notifyDriver.notifyDriver();
            }
            else{
                System.out.println("cannot find the function");
            }
        }

    }
}
