package br.com.padrao.observador.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.padrao.observador.mensagens.MensagemPadrao;
import br.com.padrao.observador.models.Notification;
import br.com.padrao.observador.models.Observer;
import br.com.padrao.observador.services.EmailNotificationService;
import br.com.padrao.observador.services.NotificationService;
import br.com.padrao.observador.services.SMSNotificationService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/comportamental")
public class NotificationController {
    private final NotificationService notificationService;

    @GetMapping("/observer")
    public ResponseEntity<Map<String, Object>> createNotification(@RequestBody Notification request) {
        MensagemPadrao msg = MensagemPadrao.MensagemPadraoImp();
        Map<String, Object> notifications = new HashMap<>();
        Observer emailNotificationService = EmailNotificationService
                .emailNotificationServiceImp(request);
        notificationService.addObserver(emailNotificationService);
        notificationService.addObserver(SMSNotificationService.smsNotificationServiceImpl(request));
        notifications = notificationService.notifyObservers(request);

        Map<String, String> detalhes = new HashMap<>();

        detalhes.put("Descrição", msg.getMensagem());
        detalhes.put("Objetivo", msg.getObjetivo());
        for (Map.Entry<String, String> entry : msg.getSituacao().entrySet()) {
            detalhes.put(entry.getKey(), entry.getValue());

        }
        notifications.put("Detalhes", detalhes);
        return ResponseEntity.ok(notifications);
    }
}
