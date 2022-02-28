package co.com.sofka.crud.repository;

import co.com.sofka.crud.entity.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
}
