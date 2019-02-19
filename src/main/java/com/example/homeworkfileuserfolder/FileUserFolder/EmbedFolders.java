package com.example.homeworkfileuserfolder.FileUserFolder;

import com.example.homeworkfileuserfolder.FileUserFolder.models.File;
import com.example.homeworkfileuserfolder.FileUserFolder.models.Folder;
import com.example.homeworkfileuserfolder.FileUserFolder.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="embedFolders", types=File.class)
public interface EmbedFolders {
    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();
}
