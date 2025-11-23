package io.github.luizeduardotsdev.arquiteturaspring.todo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/todo")
public class ToDoController {

    private ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @PostMapping
    public ToDoEntity salvar(@RequestBody ToDoEntity toDoEntity) {
        try {
            return this.toDoService.salvar(toDoEntity);
        } catch (IllegalArgumentException e) {
            var mensagem = e.getMessage();
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, mensagem);
        }
    }

    @PutMapping("/{id}")
    public void atualizarStatus(@PathVariable("id")  Integer id, @RequestBody ToDoEntity toDoEntity) {
        toDoEntity.setId(id);

        toDoService.atualizarStatus(toDoEntity);
    }

    @GetMapping("/{id}")
    public Optional<ToDoEntity> buscarTodo(@PathVariable("id") Integer id) {
        return toDoService.buscarPorId(id);
    }
}
