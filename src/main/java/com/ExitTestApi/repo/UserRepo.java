package com.ExitTestApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ExitTestApi.entity.Buyers;

public interface UserRepo extends JpaRepository<Buyers,String> {

}
