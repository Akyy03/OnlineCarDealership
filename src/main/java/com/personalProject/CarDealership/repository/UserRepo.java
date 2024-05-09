package com.personalProject.CarDealership.repository;

import com.personalProject.CarDealership.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Long> {
    Optional<UserModel> findFirstByEmail(String email);
}
