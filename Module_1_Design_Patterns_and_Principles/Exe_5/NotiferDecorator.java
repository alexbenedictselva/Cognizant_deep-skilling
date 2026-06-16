package Module_1_Design_Patterns_and_Principles.Exe_5;

public class NotiferDecorator implements Notifier{
    private Notifier notifier;

    public NotiferDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    public void send() {
        if (notifier == null)
            return;
        this.notifier.send();
    }
}
