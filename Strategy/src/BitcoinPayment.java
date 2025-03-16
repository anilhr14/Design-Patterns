public class BitcoinPayment implements PaymentStrategy {
    private String bitCoinAddress;

    public BitcoinPayment(String bitCoinAddress){
        this.bitCoinAddress = bitCoinAddress;
    }

    @Override
    public void pay(int price) {
        System.out.println("Amount "+price+" paid using Bitcoin");
    }
}
