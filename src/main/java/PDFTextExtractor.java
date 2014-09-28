import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

import java.io.IOException;

public class PDFTextExtractor {

    private PDFTextStripper stripper;

    public PDFTextExtractor() throws IOException {
        stripper = new PDFTextStripper();
    }

    public String stripText() throws IOException {
        //any path to a pdf file below
        return getStripper().getText(PDDocument.load("/home/laercio/Downloads/floresCoroaItajuba.pdf"));
    }

    public PDFTextStripper getStripper() {
        return stripper;
    }
}
