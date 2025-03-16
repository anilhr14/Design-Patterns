public class StrategyDesignPatternDemo {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.setPaymentStrategy(new CreditCardPayment(12345678,"Lian", "01-01-2025", 987));
        cart.checkout(100);

        cart.setPaymentStrategy(new PaypalPayment("lian@gmail.com", "ABC@8908"));
        cart.checkout(200);

        cart.setPaymentStrategy(new BitcoinPayment("afbnafas9f7iwfew-0ryf"));
        cart.checkout(300);
    }
}