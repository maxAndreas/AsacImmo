package com.jean.mida.ServiceImpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jean.mida.Dao.AppartementDao;

import com.jean.mida.Entity.Appartement;
import com.jean.mida.Service.AppartementService;

@Service
public class AppartementServiceImpl implements AppartementService{
	
	
	@Autowired
	private AppartementDao dao;
	
	@Override
	public Appartement saveAppartement(Appartement a) {
		// TODO Auto-generated method stub
		return  dao.save(a);
	}

	@Override
	public Appartement updateAppartement(Appartement a) {
		// TODO Auto-generated method stub
		return dao.save(a);
	}

	@Override
	public List<Appartement> getAllAppartement() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Appartement> getAllAppartement(String sortField, String sort) {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Appartement getAppartement(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAppartement(Appartement a) {
		// TODO Auto-generated method stub
		
		dao.delete(a);
		
	}

	@Override
	public Appartement findOne(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appartement findOne(String[] paramNames, Object[] paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return 0;
	}

}
