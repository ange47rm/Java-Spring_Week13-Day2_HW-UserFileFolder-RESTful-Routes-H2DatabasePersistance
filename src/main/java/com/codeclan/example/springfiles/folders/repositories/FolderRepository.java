package com.codeclan.example.springfiles.folders.repositories;

import com.codeclan.example.springfiles.folders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
