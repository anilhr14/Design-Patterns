public class PaypalPayment implements PaymentStrategy {
    private String username;
    private String password;

    public PaypalPayment(String username, String password){
        this.password = password;
        this.username = username;
    }

    @Override
    public void pay(int price) {
        System.out.println("Amount "+price+" is paid using Paypal");
    }
}
