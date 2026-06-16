package Week_1_Design_Patterns_and_Principles.Exe_3;

public class Main {
    public static void main(String[] args) {
        BuilderPatternExample comp = new BuilderPatternExample.Builder().setCpu("Intel i9").setRam("16 GB")
                .setStorage("1TB").build();

        comp.getDetails();
    }
}
