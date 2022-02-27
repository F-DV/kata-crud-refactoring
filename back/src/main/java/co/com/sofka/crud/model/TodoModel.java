package co.com.sofka.crud.model;

import co.com.sofka.crud.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;

public class TodoModel {

    @Autowired
    private Todo todo;

    public String getGroupListId() {

        return todo.getGroupListId();
    }

    public Long getId() {
        return todo.getId();
    }


    public String getName() {
        return todo.getName();
    }


    public boolean isCompleted() {
        return todo.isCompleted();
    }

}
