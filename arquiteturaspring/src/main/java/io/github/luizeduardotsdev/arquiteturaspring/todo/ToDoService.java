package io.github.luizeduardotsdev.arquiteturaspring.todo;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {

    private ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public ToDoEntity salvar(ToDoEntity toDoEntity) {

        return toDoRepository.save(toDoEntity);
    }

}
