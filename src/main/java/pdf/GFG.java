package pdf;
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;
  
import java.io.File;
import java.io.IOException;
  
public class GFG {
  
    public static void main(String[] args)
        throws IOException
    {
  
        // loading all the pdf files we wish to merge
  
        File file1 = new File(
            "D:\\Reports/reprt1.pdf");
        File file2 = new File(
            "D:\\Reports/reprt2.pdf");
  
        // Instantiating PDFMergerUtility class
  
        PDFMergerUtility obj = new PDFMergerUtility();
  
        // Setting the destination file path
  
        obj.setDestinationFileName(
            "D:\\Reports/newMerged.pdf");
  
        // Add all source files, to be merged
  
        obj.addSource(file1);
        obj.addSource(file2);
  
        // Merging documents
  
        obj.mergeDocuments();
  
        System.out.println(
            "PDF Documents merged to a single file");
    }
}