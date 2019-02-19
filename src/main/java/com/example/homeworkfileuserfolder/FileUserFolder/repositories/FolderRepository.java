package com.example.homeworkfileuserfolder.FileUserFolder.repositories;

import com.example.homeworkfileuserfolder.FileUserFolder.EmbedFile;
import com.example.homeworkfileuserfolder.FileUserFolder.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedFile.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
