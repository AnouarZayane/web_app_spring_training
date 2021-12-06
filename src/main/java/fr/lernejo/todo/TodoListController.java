package fr.lernejo.todo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class TodoListController
{
    TodoRepository repo;
    public TodoListController(TodoRepository rep)
    {
     this.repo=rep;
    }


    @PostMapping(value = "/api/todo")
    public TodoEntity addtolist(@RequestBody TodoEntity elem)
    {
        return repo.save(elem);

    }

    @GetMapping(value = "/api/todo")
    public Iterable<TodoEntity> displaylist()
    {
        return repo.findAll();
    }
}
