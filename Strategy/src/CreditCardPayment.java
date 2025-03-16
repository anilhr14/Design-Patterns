import java.util.Date;

public class CreditCardPayment implements PaymentStrategy{
    private int cardNumber;
    private String nameOnTheCard;
    private String dateOfExpiry;
    private int cvv;

    public CreditCardPayment(int cardNumber, String nameOnTheCard, String dateOfExpiry, int cvv){
        this.cardNumber = cardNumber;
        this.nameOnTheCard = nameOnTheCard;
        this.dateOfExpiry = dateOfExpiry;
        this.cvv = cvv;
    }

    @Override
    public void pay(int price) {
        System.out.println("Amount "+price+" is paid by Credit Card");
    }
}
