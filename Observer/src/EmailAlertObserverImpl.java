public class EmailAlertObserverImpl implements NotificationObserver{
    String email;
    StockObservable observable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable){
        this.email = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(email,"Product back in stock");
    }

    private void sendEmail(String email, String msg) {
        System.out.println("Mail sent to "+email +" "+ msg);
    }
}
