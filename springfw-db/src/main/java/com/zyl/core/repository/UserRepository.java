package com.zyl.core.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zyl.core.pojo.User;

//@Repository(value="userRepository")
public interface UserRepository extends JpaRepository<User, Serializable>{
	User getUserByUserName(String userName);
}
