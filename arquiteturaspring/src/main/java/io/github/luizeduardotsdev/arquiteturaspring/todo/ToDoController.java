package io.github.luizeduardotsdev.arquiteturaspring.todo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class ToDoController {

    private ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @PostMapping
    public ToDoEntity salvar(@RequestBody ToDoEntity toDoEntity) {
        return this.toDoService.salvar(toDoEntity);
    }

    @GetMapping("/{id}")
    public ToDoEntity buscarTodo(@PathVariable("id") Integer id) {
        return this.toDoService.buscarPorId(id);
    }
}
