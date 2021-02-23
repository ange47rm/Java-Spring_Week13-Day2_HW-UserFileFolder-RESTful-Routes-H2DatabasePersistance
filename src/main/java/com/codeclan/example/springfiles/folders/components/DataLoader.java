package com.codeclan.example.springfiles.folders.components;

import com.codeclan.example.springfiles.folders.models.File;
import com.codeclan.example.springfiles.folders.models.Folder;
import com.codeclan.example.springfiles.folders.models.User;
import com.codeclan.example.springfiles.folders.repositories.FileRepository;
import com.codeclan.example.springfiles.folders.repositories.FolderRepository;
import com.codeclan.example.springfiles.folders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args){
        User user1 = new User("Angelo");
        userRepository.save(user1);
        User user2 = new User("Mario");
        userRepository.save(user2);
        User user3 = new User("Luigi");
        userRepository.save(user3);

        Folder folder1 = new Folder("Music", user1);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("Photos", user2);
        folderRepository.save(folder2);
        Folder folder3 = new Folder("Videos", user3);
        folderRepository.save(folder3);

        File file1 = new File("Song", "mp3", 5000, folder1);
        fileRepository.save(file1);
        File file2 = new File("Image", ".jpg", 2000, folder2);
        fileRepository.save(file2);
        File file3 = new File("Movie", "mp4", 130000, folder3);
        fileRepository.save(file3);
    }
}
