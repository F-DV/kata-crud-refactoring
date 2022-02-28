package co.com.sofka.crud.model;

import co.com.sofka.crud.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;

public class ProjectModel {

    @Autowired
    private Project project;

    public Long getId() {

        return project.getId();
    }

    public void setId(Long id) {

        project.setId(id);
    }

    public String getName() {

        return project.getName();
    }

    public void setName(String name) {

        project.setName(name);
    }
}
