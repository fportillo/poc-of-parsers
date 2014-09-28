import org.apache.poi.hdf.extractor.WordDocument;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.File;
import java.io.FileInputStream;

public class DOCnXExtractor {

    public DOCnXExtractor() {
    }

    public String docx2String(String path) {
        File file;
        WordExtractor extractor;
        StringBuilder sb = null;
        try {
            //below any .doc or .docx file
            file = new File(path);
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            //HWPFDocument document=new HWPFDocument(fis);
            WordDocument document = new WordDocument(fis);
            //extractor = new WordExtractor(document);
            //String[] fileData = extractor.getParagraphText();
            //sb = new StringBuilder();
            //for (int i = 0; i < fileData.length; i++) {
            //    if (fileData[i] != null)
            //        sb.append(fileData[i] + "\n");
            //}
        } catch (Exception exep) {
            exep.printStackTrace();
        }
        return sb.toString();
    }
}