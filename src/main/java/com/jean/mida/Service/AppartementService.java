package com.jean.mida.Service;

import java.util.List;

import com.jean.mida.Entity.Appartement;


public interface AppartementService {
	
	

	Appartement saveAppartement (Appartement a);
	Appartement updateAppartement(Appartement a);
	 List<Appartement> getAllAppartement();
	 List<Appartement> getAllAppartement(String sortField,String sort);
		Appartement getAppartement(long id);
	 void deleteAppartement(Appartement a);
	 Appartement findOne(String paramName,Object paramValue);
	 Appartement findOne(String[] paramNames,Object[] paramValue);
	 int findCountBy(String paramName,String paramValue);


}
