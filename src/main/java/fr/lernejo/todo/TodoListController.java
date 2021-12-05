package fr.lernejo.todo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.ArrayList;

@RestController
public class TodoListController
{
    ArrayList<Todo> todolist = new ArrayList<>();
    @PostMapping(value = "/api/todo")
    public void addtolist(@RequestBody Todo elem)
    {
        todolist.add(elem);
    }

    @GetMapping(value = "/api/todo")
    public ArrayList<Todo> displaylist()
    {
        return todolist;
    }
}
