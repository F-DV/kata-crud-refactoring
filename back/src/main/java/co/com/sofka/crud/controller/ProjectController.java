package co.com.sofka.crud.controller;

import co.com.sofka.crud.entity.Project;
import co.com.sofka.crud.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping(value = "api/tasklist")
    public Iterable<Project> list(){
        return projectService.list();
    }

    @PostMapping(value = "api/task")
    public Project save(@RequestBody Project project){
        return projectService.save(project);
    }


    @PutMapping(value = "api/task")
    public Project update(@RequestBody Project project){
        if(Project.getId() != null){
            return projectService.save(project);
        }
        throw new RuntimeException("No existe el id para actualizar");
    }

    @DeleteMapping(value = "api/{id}/task")
    public void delete(@PathVariable("id") Long id){
        projectService.delete(id);
    }

    @GetMapping(value = "api/{id}/task")
    public Project get(@PathVariable("id") Long id){
        return projectService.get(id);
    }
}
}
