package com.example.homeworkfileuserfolder.FileUserFolder.repositories;

import com.example.homeworkfileuserfolder.FileUserFolder.EmbedFoldersUser;
import com.example.homeworkfileuserfolder.FileUserFolder.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedFoldersUser.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
