package com.example.homeworkfileuserfolder.FileUserFolder;

import com.example.homeworkfileuserfolder.FileUserFolder.models.File;
import com.example.homeworkfileuserfolder.FileUserFolder.models.Folder;
import com.example.homeworkfileuserfolder.FileUserFolder.models.User;
import com.example.homeworkfileuserfolder.FileUserFolder.repositories.FileRepository;
import com.example.homeworkfileuserfolder.FileUserFolder.repositories.FolderRepository;
import com.example.homeworkfileuserfolder.FileUserFolder.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileUserFolderApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreatUserAndFolder() {

		User user1 = new User("Unai Emery");
		userRepository.save(user1);

		Folder folder1 = new Folder("Java Projects", user1);
		folderRepository.save(folder1);
	}

	@Test
	public void canCreatFileAndFolder() {
		User user1 = new User("Unai Emery");
		userRepository.save(user1);

		Folder folder1 = new Folder("Java Projects", user1);
		folderRepository.save(folder1);

		File file1 = new File("Projects", "Java", 50, folder1);
        fileRepository.save(file1);
	}

}
