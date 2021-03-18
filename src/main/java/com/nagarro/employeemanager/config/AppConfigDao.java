package com.nagarro.employeemanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nagarro.employeemanager.dao.HRManagerDao;
import com.nagarro.employeemanager.daoImp.HRManagerDaoImp;

@Configuration
public class AppConfigDao {

	@Bean
	public HRManagerDao getHRManager() {
		return new HRManagerDaoImp();
	}
}