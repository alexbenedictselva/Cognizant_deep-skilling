package Week_1_Design_Patterns_and_Principles.Exe_1;

public class Main {
    public static void main(String[] args) {
        SingletonPatternExample logger1 = SingletonPatternExample.getInstance();
        SingletonPatternExample logger2 = SingletonPatternExample.getInstance();

        logger1.login("Hello");
        logger2.login("HI");

        System.out.println(logger1);
        System.out.println(logger2);


    }
}
