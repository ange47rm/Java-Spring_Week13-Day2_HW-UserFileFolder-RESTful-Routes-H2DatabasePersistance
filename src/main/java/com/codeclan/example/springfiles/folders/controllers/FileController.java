package com.codeclan.example.springfiles.folders.controllers;

import com.codeclan.example.springfiles.folders.models.File;
import com.codeclan.example.springfiles.folders.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;

    // GET ALL
    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllFiles(){
        return new ResponseEntity<>(fileRepository.findAll(), HttpStatus.OK);
    }

    // GET ONE
    @GetMapping(value = "/files/{id}")
    public ResponseEntity<File> getFile(@PathVariable Long id){
        return new ResponseEntity(fileRepository.findById(id), HttpStatus.OK);
    }

    // CREATE ONE
    @PostMapping(value = "/files")
    public ResponseEntity<File> postFile(@RequestBody File file){
        fileRepository.save(file);
        return new ResponseEntity<>(file, HttpStatus.CREATED);
    }
}
