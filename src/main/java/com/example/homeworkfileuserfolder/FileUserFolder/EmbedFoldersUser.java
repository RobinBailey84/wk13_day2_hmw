package com.example.homeworkfileuserfolder.FileUserFolder;

import com.example.homeworkfileuserfolder.FileUserFolder.models.Folder;
import com.example.homeworkfileuserfolder.FileUserFolder.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="embedFoldersUser", types=User.class)
public interface EmbedFoldersUser {
    String getName();
    Folder getFolders();
}
