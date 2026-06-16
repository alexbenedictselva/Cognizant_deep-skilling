package Module_1_Design_Patterns_and_Principles.Exe_2.Factory;

import Module_1_Design_Patterns_and_Principles.Exe_2.Documents.Document;
import Module_1_Design_Patterns_and_Principles.Exe_2.Documents.WordDocument;

public class WordFactory extends Factory{
    public Document createDocument() {
        return new WordDocument();
    }
}
