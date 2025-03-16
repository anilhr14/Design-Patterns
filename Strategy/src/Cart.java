
public class Cart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy){
        this.paymentStrategy = strategy;
    }

    public void checkout(int price){
        paymentStrategy.pay(price);
    }
}
