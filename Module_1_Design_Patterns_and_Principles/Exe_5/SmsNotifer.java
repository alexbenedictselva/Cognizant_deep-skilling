package Module_1_Design_Patterns_and_Principles.Exe_5;

public class SmsNotifer extends NotiferDecorator {
    public SmsNotifer() {
        super(null);
    }

    public SmsNotifer(Notifier n) {
        super(n);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("SMS sent");
    }
}
