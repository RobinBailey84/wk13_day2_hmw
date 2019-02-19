package com.example.homeworkfileuserfolder.FileUserFolder.components;

import com.example.homeworkfileuserfolder.FileUserFolder.models.File;
import com.example.homeworkfileuserfolder.FileUserFolder.models.Folder;
import com.example.homeworkfileuserfolder.FileUserFolder.models.User;
import com.example.homeworkfileuserfolder.FileUserFolder.repositories.FileRepository;
import com.example.homeworkfileuserfolder.FileUserFolder.repositories.FolderRepository;
import com.example.homeworkfileuserfolder.FileUserFolder.repositories.UserRepository;
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

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception{

        User user1 = new User("Unai Emery");
        userRepository.save(user1);

        Folder folder1 = new Folder("Java Projects", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Things To Do", user1);
        folderRepository.save(folder2);

        File file1 = new File("Projects", "Java", 50, folder1);
        fileRepository.save(file1);

        File file2 = new File("Bonus", "txt", 20, folder2);
        fileRepository.save(file2);
    }

}
