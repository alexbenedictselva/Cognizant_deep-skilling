package Module_1_Design_Patterns_and_Principles.Exe_1;

public class SingletonPatternExample {
    private static SingletonPatternExample logger;

    private SingletonPatternExample() {
        System.out.println("constructor called");
    }

    public static SingletonPatternExample getInstance() {
        if (logger == null) {
            logger = new SingletonPatternExample();
        }
        // login();
        return logger;
    }

    public void login(String x) {
        System.out.println(x);
    }

}
