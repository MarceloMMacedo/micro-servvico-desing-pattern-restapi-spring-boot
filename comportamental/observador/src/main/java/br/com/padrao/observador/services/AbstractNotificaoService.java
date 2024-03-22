package br.com.padrao.observador.services;

import br.com.padrao.observador.models.Notification;
import lombok.Data;

@Data
public abstract class AbstractNotificaoService {

    private Notification notification;

    public abstract void AddNotification(Notification notification);

}
