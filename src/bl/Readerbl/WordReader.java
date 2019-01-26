package bl.Readerbl;

import Stub.ReaderStub;
import Util.ResultMessage;

public class WordReader extends Reader {

    public ResultMessage readDocument(String filename){
        ResultMessage rmg = ResultMessage.FAILED;

        ReaderStub rStub = new ReaderStub();
        rmg = rStub.readWord(filename);

        return rmg;
    }

}
