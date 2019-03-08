package com.enigma.task.trainee.dao;

import java.util.List;

import com.enigma.task.bootcampbatch.model.BootcampBatch;
import com.enigma.task.trainee.exception.CustomException;
import com.enigma.task.trainee.model.Trainee;


public interface TraineeDao {
	public Trainee getById(int id) throws CustomException;
	public Trainee save(Trainee trainee) throws CustomException;
	void delete(Trainee trainee) throws CustomException;

	List<Trainee> getList() throws CustomException;
	List<Trainee> getListByActiveFlag() throws CustomException;
	List<Trainee> getBootcampBatchList(BootcampBatch bootcampBatch) throws CustomException;
}
