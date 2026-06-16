package Week_1_Design_Patterns_and_Principles.Exe_5;

public class Main {
    public static void main(String[] args) {
        
        Notifier full = new SmsNotifer(new EmailNotifier(new SmsNotifer()));
        full.send();
    }
}
