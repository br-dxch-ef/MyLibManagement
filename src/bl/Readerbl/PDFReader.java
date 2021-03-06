package bl.Readerbl;

import Stub.ReaderStub;
import Util.ResultMessage;

public class PDFReader extends Reader {

    public ResultMessage readDocument(String filename){
        ResultMessage rmg = ResultMessage.FAILED;

        ReaderStub rStub = new ReaderStub();
        rmg = rStub.readPDF(filename);

        return rmg;
    }

}
