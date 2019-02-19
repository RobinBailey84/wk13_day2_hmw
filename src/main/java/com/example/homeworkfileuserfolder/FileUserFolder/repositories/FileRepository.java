package com.example.homeworkfileuserfolder.FileUserFolder.repositories;

import com.example.homeworkfileuserfolder.FileUserFolder.EmbedFolders;
import com.example.homeworkfileuserfolder.FileUserFolder.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedFolders.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
