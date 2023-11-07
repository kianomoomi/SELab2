package PaymentServices;

public interface OrderRegisterService {
    public void orderRegister(String customerName);
}

public interface OrderPaymentService {
    public void orderPayment(int foodPrice);
}
