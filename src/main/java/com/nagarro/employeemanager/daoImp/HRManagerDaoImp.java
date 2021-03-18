package com.nagarro.employeemanager.daoImp;

import org.hibernate.Session;

import com.nagarro.employeemanager.config.HibernateConfig;
import com.nagarro.employeemanager.dao.HRManagerDao;
import com.nagarro.employeemanager.dto.HRManager;

public class HRManagerDaoImp implements HRManagerDao{

	public HRManager getHRManager(String hrmId) {
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		HRManager hrmObject = session.get(HRManager.class, hrmId);
		
		session.close();
		
		return hrmObject;
	}
	
}
