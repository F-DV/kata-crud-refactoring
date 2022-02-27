package co.com.sofka.crud.model;

import co.com.sofka.crud.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;

public class TodoModel {

    @Autowired
    private Todo todo;

    public String getGroupListId() {

        return todo.getGroupListId();
    }
    public void setGroupListId(String groupList){
        todo.setGroupListId(groupList);
    }

    public Long getId() {
        return todo.getId();
    }

    public void setId(Long id){
        todo.setId(id);
    }

    public String getName() {
        return todo.getName();
    }

    public void setName(String name){
        todo.setName(name);
    }

    public boolean isCompleted() {
        return todo.isCompleted();
    }

    public void setIsCompleted(boolean completed){
        todo.setCompleted(completed);
    }

}
