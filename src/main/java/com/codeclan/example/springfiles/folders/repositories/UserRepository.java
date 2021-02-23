package com.codeclan.example.springfiles.folders.repositories;

import com.codeclan.example.springfiles.folders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
