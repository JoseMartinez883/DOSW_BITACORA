package dosw.semana_4.observerFactoryMethodEjercicio02;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<NotificationObserver> observerList;
    StateOrder stateOrder;

    public Order() {
        this.observerList = new ArrayList<>();
        this.stateOrder = StateOrder.PENDIENTE;
    }

    public void notifiy(){
        OrderEvent orderEvent = new OrderEvent(observerList.size(),"La orden cambio de estado");
        observerList.forEach(observer -> observer.notify(orderEvent));
    }

    public void suscribe(NotificationObserver notificationObserver){
        observerList.add(notificationObserver);
    }

    public void unsuscribed(NotificationObserver notificationObserver){
        observerList.remove(notificationObserver);
    }
    public List<NotificationObserver> getObserverList() {
        return observerList;
    }

    public StateOrder getStateOrder() {
        return stateOrder;
    }

    public void setStateOrder(StateOrder stateOrder) {
        this.stateOrder = stateOrder;
        notifiy();
    }
}
