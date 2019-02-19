package com.example.homeworkfileuserfolder.FileUserFolder;

import com.example.homeworkfileuserfolder.FileUserFolder.models.File;
import com.example.homeworkfileuserfolder.FileUserFolder.models.Folder;
import com.example.homeworkfileuserfolder.FileUserFolder.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="embedFile", types=Folder.class)
public interface EmbedFile {
    String getTitle();
    File getFiles();
    User getUser();
}
