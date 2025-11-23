package io.github.luizeduardotsdev.arquiteturaspring.todo;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ToDoService {

    private ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public ToDoEntity salvar(ToDoEntity toDoEntity) {

        return toDoRepository.save(toDoEntity);
    }

    public Optional<ToDoEntity> buscarPorId(Integer id) {
        return toDoRepository.findById(id);
    }

}
