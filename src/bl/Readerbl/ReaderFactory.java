package bl.Readerbl;

public class ReaderFactory {

    public Reader createReader(String type){
        if(type.equals("Word")){
            return new WordReader();
        }
        else if(type.equals("PDF")){
            return new PDFReader();
        }
        else if(type.equals("EPUB")){
            return new EPUBReader();
        }
        else{
            System.out.println("cannot find a proper reader");
            return null;
        }
    }

}
