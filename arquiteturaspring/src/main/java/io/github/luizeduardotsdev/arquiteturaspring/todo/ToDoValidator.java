package io.github.luizeduardotsdev.arquiteturaspring.todo;

import org.springframework.stereotype.Component;

@Component
public class ToDoValidator {

    private ToDoRepository toDoRepository;

    public ToDoValidator(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public void validar(ToDoEntity toDoEntity) {
        if(existeDescricao(toDoEntity.getDescricao())){
            throw new IllegalArgumentException("ja existe um to do com essa descricao");
        }
    }

    private boolean existeDescricao(String descricao) {

        return toDoRepository.existByDescricao(descricao);
    }
}
