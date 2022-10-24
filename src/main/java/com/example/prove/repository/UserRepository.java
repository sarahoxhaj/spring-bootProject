package com.example.prove.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.prove.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}


