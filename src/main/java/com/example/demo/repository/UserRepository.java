
package com.example.demo.repository;

import com.example.demo.models.UserModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository
        extends JpaRepository<UserModels, Long> {
            UserModels findByEmail(String email);
}
