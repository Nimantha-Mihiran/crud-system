package com.example.crud.system.repo;

import com.example.crud.system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User,Integer>{

}
