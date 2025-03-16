import java.util.ArrayList;

public class IphoneObservableImpl implements StockObservable{
    public ArrayList<NotificationObserver> observerList = new ArrayList<>();
    public int stockCount = 0;
    @Override
    public void add(NotificationObserver notificationObserver) {
        observerList.add(notificationObserver);
    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
        observerList.remove(notificationObserver);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(stockCount == 0){
            notifySubscribers();
        }
        this.stockCount += newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
