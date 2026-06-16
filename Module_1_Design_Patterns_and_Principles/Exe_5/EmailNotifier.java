package Module_1_Design_Patterns_and_Principles.Exe_5;

public class EmailNotifier extends NotiferDecorator {
    public EmailNotifier() {
        super(null);
    };

    public EmailNotifier(Notifier n) {
        super(n);
    }

    public void send() {
        super.send();
        System.out.println("Email sent");
    }
}
