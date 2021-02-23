package com.codeclan.example.springfiles.folders.repositories;

import com.codeclan.example.springfiles.folders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
