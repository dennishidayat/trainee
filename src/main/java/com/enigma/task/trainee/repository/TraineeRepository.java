package com.enigma.task.trainee.repository;


import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.enigma.task.bootcampbatch.model.BootcampBatch;
import com.enigma.task.trainee.model.Trainee;


public interface TraineeRepository extends PagingAndSortingRepository<Trainee, Integer> {
	List<Trainee> findByBootcampBatch(BootcampBatch bootcampBatch);
}
