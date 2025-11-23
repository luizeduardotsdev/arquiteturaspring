package io.github.luizeduardotsdev.arquiteturaspring.todo;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ToDoService {

    private ToDoRepository toDoRepository;
    private ToDoValidator toDoValidator;
    private MailSender mailSender;

    public ToDoService(ToDoRepository toDoRepository, ToDoValidator toDoValidator, MailSender mailSender) {
        this.toDoRepository = toDoRepository;
        this.toDoValidator = toDoValidator;
        this.mailSender = mailSender;
    }

    public ToDoEntity salvar(ToDoEntity toDoEntity) {
        toDoValidator.validar(toDoEntity);
        return toDoRepository.save(toDoEntity);
    }

    public void atualizarStatus(ToDoEntity toDoEntity) {
        toDoRepository.save(toDoEntity);
        mailSender.enviarMensagem(toDoEntity.getDescricao());

    }

    public ToDoEntity buscarPorId(Integer id) {
        return toDoRepository.findById(id).orElse(null);
    }

}
