package com.experion.ecommerce.dao;

import com.experion.ecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "user", path="user-data")
@CrossOrigin(origins="*")
public interface UserRepository extends JpaRepository<User,Long> {
}
