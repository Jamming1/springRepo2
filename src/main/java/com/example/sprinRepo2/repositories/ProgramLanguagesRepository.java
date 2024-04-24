package com.example.sprinRepo2.repositories;

import entities.ProgramLanguages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramLanguagesRepository extends JpaRepository<ProgramLanguages,Long> {
}
