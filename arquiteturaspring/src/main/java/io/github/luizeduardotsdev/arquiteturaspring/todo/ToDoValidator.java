package io.github.luizeduardotsdev.arquiteturaspring.todo;

import org.springframework.stereotype.Component;

@Component
public class ToDoValidator {

    private ToDoRepository toDoRepository;

    public ToDoValidator(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    private boolean existDescricao(String descricao) {

        return toDoRepository.existsByDescricao(descricao);
    }

    public void validar(ToDoEntity toDoEntity) {
        if(existDescricao(toDoEntity.getDescricao())){
            throw new IllegalArgumentException("ja existe um to do com essa descricao");
        }
    }


}
