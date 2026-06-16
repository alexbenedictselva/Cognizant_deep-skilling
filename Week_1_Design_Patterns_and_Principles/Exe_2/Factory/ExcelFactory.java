package Week_1_Design_Patterns_and_Principles.Exe_2.Factory;

import Week_1_Design_Patterns_and_Principles.Exe_2.Documents.Document;
import Week_1_Design_Patterns_and_Principles.Exe_2.Documents.ExcelDocument;

public class ExcelFactory extends Factory{
    public Document createDocument() {
        return new ExcelDocument();
    }
}
