package com.enigma.task.trainee.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;

import com.enigma.task.bootcampbatch.model.BootcampBatch;
import com.enigma.task.trainee.dao.TraineeDao;
import com.enigma.task.trainee.exception.CustomException;
import com.enigma.task.trainee.model.Trainee;
import com.enigma.task.trainee.repository.TraineeRepository;

public class TraineeDaoImpl extends BaseImpl implements TraineeDao{
	
	@Autowired
	private TraineeRepository repository;

	public Trainee getById(int id) throws CustomException {
		return repository.findById(id).orElse(null);
	}

	public Trainee save(Trainee trainee) throws CustomException {
		return repository.save(trainee);
	}

	public void delete(Trainee trainee) throws CustomException {
		repository.delete(trainee);
	}

	public List<Trainee> getList() throws CustomException {
		CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<Trainee> query = critB.createQuery(Trainee.class);
		Root<Trainee> root = query.from(Trainee.class);
		query.select(root);
		
		TypedQuery<Trainee> i = em.createQuery(query);
		
		return i.getResultList();
	}

	public List<Trainee> getListByActiveFlag() throws CustomException {
		CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<Trainee> query = critB.createQuery(Trainee.class);
		Root<Trainee> root = query.from(Trainee.class);
		query = query.select(root)
				.where(critB.equal(root.get("activeFlag"), 1));
		
		TypedQuery<Trainee> i = em.createQuery(query);
		
		return i.getResultList();
	}

	public List<Trainee> getBootcampBatchList(BootcampBatch bootcampBatch) throws CustomException {
		return repository.findByBootcampBatch(bootcampBatch);
	}

}
