package Lectures.DesingPatterns.StructuralDP.Adapter.RazorPay;

public class RazorPayGateway {
    public String payByCC(String cc, String cvv, String expiry) {
        System.out.println("Payment done by Razor Pay");
        return "111";
    }

    public boolean checkPaymentStatus(String id) {
        return false;
    }
}
