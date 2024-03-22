package br.com.padrao.observador.services;

import br.com.padrao.observador.models.Notification;
import br.com.padrao.observador.models.Observer;

public class SMSNotificationService extends AbstractNotificaoService implements Observer {
    @Override
    public String update() {
        System.out.println("Enviando SMS de notificação: " + getNotification().getMessage());
        return "Enviando SMS de notificação: " + getNotification().getMessage();
    }

    @Override
    public void AddNotification(Notification notification) {
        setNotification(notification);
    }

    public static SMSNotificationService smsNotificationServiceImpl(Notification notification) {
        SMSNotificationService smsNotificationService = new SMSNotificationService();
        smsNotificationService.AddNotification(notification);
        return smsNotificationService;
    }

}
