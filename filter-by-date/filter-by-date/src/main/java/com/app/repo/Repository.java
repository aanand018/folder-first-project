package com.app.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.YourEntity;

public interface Repository extends JpaRepository<YourEntity, Integer> {

	List<YourEntity> findByDateFieldBetween(Date startDate, Date endDate);

}
