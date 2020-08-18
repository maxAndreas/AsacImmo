package com.jean.mida.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.jean.mida.Dao.VisiteDao;
import com.jean.mida.Entity.Visite;
import com.jean.mida.Service.VisiteService;

@Service
public class VisiteServiceImpl implements VisiteService {
	
	@Autowired
	private VisiteDao dao;
	

	@Override
	public Visite saveVisite(Visite v) {
		// TODO Auto-generated method stub
		return dao.save(v);
	}

	@Override
	public Visite updateVisite(Visite v) {
		// TODO Auto-generated method stub
		return dao.save(v);
	}

	@Override
	public List<Visite> getAllVisite() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Visite> getAllVisite(String sortField, String sort) {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Visite getVisite(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteVisite(Visite v) {
		// TODO Auto-generated method stub
		
		dao.delete(v);
		
	}

	@Override
	public Visite findOne(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visite findOne(String[] paramNames, Object[] paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return 0;
	}


	}
