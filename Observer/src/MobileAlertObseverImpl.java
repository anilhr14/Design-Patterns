public class MobileAlertObseverImpl implements NotificationObserver{

    String username;
    StockObservable observable;

    public MobileAlertObseverImpl(String username, StockObservable stockObservable){
        this.observable = stockObservable;
        this.username = username;
    }

    @Override
    public void update() {
        sendMsg(username, "Product is back in stock");
    }

    public void sendMsg(String username, String msg){
        System.out.println("Mobile notification sent to "+username+" "+msg);
    }
}
