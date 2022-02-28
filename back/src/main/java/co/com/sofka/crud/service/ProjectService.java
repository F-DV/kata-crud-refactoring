package co.com.sofka.crud.service;

import co.com.sofka.crud.entity.Project;
import co.com.sofka.crud.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Iterable<Project> list(){
        return projectRepository.findAll();
    }

    public Project get(Long id){
        return projectRepository.findById(id).orElseThrow();
    }

    public Project save(Project project){
        return projectRepository.save(project);
    }

    public void delete(Long id){
        projectRepository.delete(get(id));
    }
}
