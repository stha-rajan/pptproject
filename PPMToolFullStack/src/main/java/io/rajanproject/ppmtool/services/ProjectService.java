package io.rajanproject.ppmtool.services;

import io.rajanproject.ppmtool.domain.Project;
import io.rajanproject.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){
//        there will be different logic later
        return projectRepository.save(project);

    }
}
