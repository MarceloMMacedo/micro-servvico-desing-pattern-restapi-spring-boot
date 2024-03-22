package br.com.padrao.observador.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.padrao.observador.models.Notification;
import br.com.padrao.observador.models.Observer;

@Service
public class NotificationService {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public Map<String, Object> notifyObservers(Notification notification) {
        Map<String, Object> notifications = new HashMap<>();
        for (Observer observer : observers) {
            String result = observer.update();
            notifications.put(observer.getClass().getSimpleName(), result);

        }

        return notifications;
    }
}
