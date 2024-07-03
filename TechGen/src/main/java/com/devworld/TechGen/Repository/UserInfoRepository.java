package com.devworld.TechGen.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devworld.TechGen.Entity.UserInfo;



	public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
	    Optional<UserInfo> findByName(String username);
	    }
