package com.example.security.Repository;


import com.example.security.Modle.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Integer> {


    Todo findTodoById(Integer id);
}
