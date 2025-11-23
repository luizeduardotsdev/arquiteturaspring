package io.github.luizeduardotsdev.arquiteturaspring.todo;

import org.springframework.stereotype.Component;

@Component
public class MailSender {

    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem: " + mensagem);
    }
}
