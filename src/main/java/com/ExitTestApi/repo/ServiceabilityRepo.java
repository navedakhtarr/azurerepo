package com.ExitTestApi.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;



import com.ExitTestApi.entity.Serviceability;

public  interface ServiceabilityRepo extends JpaRepository<Serviceability, Integer>{

	
    List<Serviceability> findByPidAndPincodes(int id ,int code);
}
