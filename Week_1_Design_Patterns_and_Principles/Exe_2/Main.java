package Week_1_Design_Patterns_and_Principles.Exe_2;

import Week_1_Design_Patterns_and_Principles.Exe_2.Documents.Document;
import Week_1_Design_Patterns_and_Principles.Exe_2.Factory.ExcelFactory;
import Week_1_Design_Patterns_and_Principles.Exe_2.Factory.PdfFactory;
import Week_1_Design_Patterns_and_Principles.Exe_2.Factory.WordFactory;

public class Main {
    public static void main(String[] args) {
        PdfFactory pdfFact = new PdfFactory();
        Document pdfDoc = pdfFact.createDocument();
        pdfDoc.open();
        WordFactory wordFact = new WordFactory();
        Document wordDoc = wordFact.createDocument();
        wordDoc.open();
        ExcelFactory excelFact = new ExcelFactory();
        Document excelDoc = excelFact.createDocument();
        excelDoc.open();

    }
}
