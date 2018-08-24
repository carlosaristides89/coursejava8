package com.krlos.coursejava8.barcode;


import com.itextpdf.barcodes.Barcode128;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.kernel.pdf.xobject.PdfFormXObject;

public class Barcode {
    public static final String dest = "/Users/krlos/barcode.pdf";
    public static void main (String [] args) {
        try {
                PdfDocument pdfDoc = new PdfDocument(new PdfWriter(dest));
                PdfCanvas canvas = new PdfCanvas(pdfDoc.addNewPage());
                Barcode128 code128 = new Barcode128(pdfDoc);
                code128.setCode("PB00160");
                code128.setCodeType(Barcode128.CODE128);
                PdfFormXObject xObject = code128.createFormXObject(Color.BLACK.BLACK, Color.BLACK, pdfDoc);
                float x = 36;
                float y = 750;
                float w = xObject.getWidth();
                float h = xObject.getHeight();
                canvas.saveState();
                canvas.setFillColor(Color.WHITE);
                canvas.rectangle(x, y, w, h);
                canvas.fill();
                canvas.restoreState();
                canvas.addXObject(xObject, 36, 750);
                pdfDoc.close();


        }catch (Exception e){
            System.out.println(e);
        }
    }
}
