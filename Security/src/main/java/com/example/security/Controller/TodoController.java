package com.example.security.Controller;


import com.example.security.Modle.Todo;
import com.example.security.Service.TodoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/todo")
public class TodoController {


    private final TodoService todoService;



    @GetMapping("/get")
    public ResponseEntity getAllToto(){

        return ResponseEntity.status(200).body(todoService.getAllTodo());
    }


    @PostMapping("/add")
    public ResponseEntity addTodo(@RequestBody @Valid Todo todo){

        todoService.addTodo(todo);
        return ResponseEntity.status(200).body("todo added");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateTodo(@PathVariable Integer id, @RequestBody @Valid Todo todo){

        todoService.updateTodo(id,todo);
        return ResponseEntity.status(200).body("todo updated");

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteTodo(@PathVariable Integer id){
        todoService.deleteTodo(id);
        return ResponseEntity.status(200).body("todo deleted");


    }
}
