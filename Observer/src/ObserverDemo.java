public class ObserverDemo {
    public static void main(String[] args) {
        StockObservable stockObservable = new IphoneObservableImpl();

        NotificationObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com", stockObservable);
        NotificationObserver observer2 = new MobileAlertObseverImpl("Anil", stockObservable);

        stockObservable.add(observer1);
        stockObservable.add(observer2);
        stockObservable.setStockCount(10);
    }
}