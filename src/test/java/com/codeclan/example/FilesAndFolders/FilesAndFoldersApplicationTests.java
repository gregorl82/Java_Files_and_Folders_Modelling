package com.codeclan.example.FilesAndFolders;

import com.codeclan.example.FilesAndFolders.models.File;
import com.codeclan.example.FilesAndFolders.models.Folder;
import com.codeclan.example.FilesAndFolders.models.User;
import com.codeclan.example.FilesAndFolders.repositories.FileRepository;
import com.codeclan.example.FilesAndFolders.repositories.FolderRepository;
import com.codeclan.example.FilesAndFolders.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilesAndFoldersApplicationTests {

	@Autowired
	private FileRepository fileRepository;

	@Autowired
	private FolderRepository folderRepository;

	@Autowired
	private UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateAndSaveFile(){
		User user = new User("gregorL");
		userRepository.save(user);

		Folder folder = new Folder("My Documents", user);
		folderRepository.save(folder);

		File file = new File("MyCV", "docx", 232, folder);
		fileRepository.save(file);
	}

}
