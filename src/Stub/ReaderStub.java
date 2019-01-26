package Stub;

import Util.ResultMessage;

public class ReaderStub {

    public ResultMessage readWord(String filename){
        System.out.println("Open a Word document.");

        return ResultMessage.SUCCESS;
    }

    public ResultMessage readPDF(String filename){
        System.out.println("Open a PDF document.");

        return ResultMessage.SUCCESS;
    }

    public ResultMessage readEPUB(String filename){
        System.out.println("Open a EPUB document.");

        return ResultMessage.SUCCESS;
    }

}
