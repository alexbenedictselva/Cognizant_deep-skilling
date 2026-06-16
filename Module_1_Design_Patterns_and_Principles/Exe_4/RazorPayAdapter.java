package Module_1_Design_Patterns_and_Principles.Exe_4;

public class RazorPayAdapter implements PaymentGateway {
    private RazorPay razor;

    public RazorPayAdapter() {
        this.razor = new RazorPay();
    }
    public void makePayment(double amt) {
        razor.proceedPayment(amt);
    }
}
