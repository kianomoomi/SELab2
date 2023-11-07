package PaymentServices;

public class OnSiteOrderService implements OrderRegisterService, OrderPaymentService {
    @Override
    public void orderRegister(String customerName) {
        System.out.println("on-site order registered for " + customerName);
    }

    @Override
    public void orderPayment(int foodPrice) {
        System.out.println("on-Site Payment with Price : " + foodPrice + " Tomans!");
    }
}
