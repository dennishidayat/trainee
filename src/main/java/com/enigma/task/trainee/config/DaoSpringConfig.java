package com.enigma.task.trainee.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.enigma.task.trainee.dao.TraineeDao;
import com.enigma.task.trainee.dao.impl.TraineeDaoImpl;

@Configuration
public class DaoSpringConfig {
	
	@Bean
	public TraineeDao TraineeDao() {
		return new TraineeDaoImpl();
	}
	
	@Bean
    public ModelMapper modelMapper() {
    	return new ModelMapper();
    }

}
