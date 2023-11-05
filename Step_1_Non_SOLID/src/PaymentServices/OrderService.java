package PaymentServices;

public interface OrderService {
    public void onSiteOrderRegister(String customerName);
    public void onlineOrderRegister(String customerName);
    public void PhoneOrderRegister(String customerName);
    public void onSiteOrderPayment(int foodPrice);
    public void onlineOrderPayment(int foodPrice);
    public void PhoneOrderPayment(int foodPrice);
}