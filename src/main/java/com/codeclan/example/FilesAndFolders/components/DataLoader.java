package com.codeclan.example.FilesAndFolders.components;

import com.codeclan.example.FilesAndFolders.models.File;
import com.codeclan.example.FilesAndFolders.models.Folder;
import com.codeclan.example.FilesAndFolders.models.User;
import com.codeclan.example.FilesAndFolders.repositories.FileRepository;
import com.codeclan.example.FilesAndFolders.repositories.FolderRepository;
import com.codeclan.example.FilesAndFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private FolderRepository folderRepository;

    @Autowired
    private FileRepository fileRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) {
        User user1 = new User("ebrown");
        userRepository.save(user1);

        User user2 = new User("glennie");
        userRepository.save(user2);

        Folder folder1 = new Folder("Downloads", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("My Documents", user2);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("Applications", user2);
        folderRepository.save(folder3);

        File file1 = new File("CV FEB2020", "docx", 323, folder2);
        fileRepository.save(file1);

        File file2 = new File("Lesson2Notes", "pdf", 572, folder1);
        fileRepository.save(file2);

        File file3 = new File("Readme", "txt", 23, folder3);
        fileRepository.save(file3);

        File file4 = new File("Lesson4Notes", "pdf", 923, folder1);
        fileRepository.save(file4);

    }
}
