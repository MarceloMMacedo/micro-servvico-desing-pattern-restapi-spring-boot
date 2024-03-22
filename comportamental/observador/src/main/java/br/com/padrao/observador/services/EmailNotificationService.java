package br.com.padrao.observador.services;

import br.com.padrao.observador.models.Notification;
import br.com.padrao.observador.models.Observer;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class EmailNotificationService extends AbstractNotificaoService implements Observer {

    @Override
    public String update() {
        System.out.println("Enviando email de notificação: " + getNotification().getMessage());
        return "Enviando email de notificação: " + getNotification().getMessage();
    }

    @Override
    public void AddNotification(Notification notification) {
        setNotification(notification);
    }

    public static EmailNotificationService emailNotificationServiceImp(Notification notification) {
        EmailNotificationService emailNotificationService = new EmailNotificationService();
        emailNotificationService.AddNotification(notification);
        return emailNotificationService;
    }
}
