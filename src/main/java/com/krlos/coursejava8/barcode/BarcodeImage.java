package com.krlos.coursejava8.barcode;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.BarcodeEAN;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;

public class BarcodeImage {
    public static final String dest = "/Users/krlos/";
    public static void main(String[] args) {
        BarcodeImage.createPDF("barcodeImage.pdf", "PB000160");
    }

    public static void createPDF(String pdfFilename, String myString) {
        Document doc = new Document();
        PdfWriter docWriter = null;
        try {
            docWriter = PdfWriter.getInstance(doc, new FileOutputStream(dest + pdfFilename));
            doc.addAuthor("krlos");
            doc.addCreationDate();
            doc.addProducer();
            doc.addCreator("krlos.com");
            doc.addTitle("krlos Barcode test");
            doc.setPageSize(PageSize.LETTER);
            doc.open();
            PdfContentByte cb = docWriter.getDirectContent();

            Barcode128 code128 = new Barcode128();
            code128.setCode(myString.trim());
            code128.setCodeType(Barcode128.CODE128);
            Image code128Image = code128.createImageWithBarcode(cb, null, null);
            code128Image.setAbsolutePosition(10, 700);
            code128Image.scalePercent(125);
            doc.add(code128Image);

        } catch (DocumentException dex) {
            dex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (doc != null) {
                doc.close();
            }
            if (docWriter != null) {
                docWriter.close();
            }
        }
    }
}


