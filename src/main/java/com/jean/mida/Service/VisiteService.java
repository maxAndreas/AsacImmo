package com.jean.mida.Service;

import java.util.List;


import com.jean.mida.Entity.Visite;

public interface VisiteService {
	
	
	Visite saveVisite (Visite v);
	Visite updateVisite(Visite v);
	 List<Visite> getAllVisite();
	 List<Visite> getAllVisite(String sortField,String sort);
	 void deleteVisite(Visite v);
	 Visite findOne(String paramName,Object paramValue);
	 Visite findOne(String[] paramNames,Object[] paramValue);
	 int findCountBy(String paramName,String paramValue);
	Visite getVisite(long id);


}
