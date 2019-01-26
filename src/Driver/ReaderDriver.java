package Driver;

import bl.Readerbl.Reader;
import bl.Readerbl.ReaderFactory;

public class ReaderDriver {

    public void ReadWordDriver(){
        ReaderFactory rdf = new ReaderFactory();
        Reader myRdWord = rdf.createReader("Word");
        myRdWord.readDocument("MyFile");
    }

    public void ReadPDFDriver(){
        ReaderFactory rdf = new ReaderFactory();
        Reader myRdPDF = rdf.createReader("PDF");
        myRdPDF.readDocument("MyFile");
    }

    public void ReadEPUBDriver(){
        ReaderFactory rdf = new ReaderFactory();
        Reader myRdEPUB = rdf.createReader("EPUB");
        myRdEPUB.readDocument("MyFile");
    }

}
