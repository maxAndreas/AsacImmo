package com.jean.mida.Service;

import java.util.List;

import com.jean.mida.Entity.Client;

public interface ClientService {
	
	
	

	Client saveClient (Client c);
	 Client updateClient(Client c);
	 List<Client> getAllClient();
	 List<Client> getAllClient(String sortField,String sort);
          Client getClient(long id);
	 void deleteClient(Client c);
	 Client findOne(String paramName,Object paramValue);
	 Client findOne(String[] paramNames,Object[] paramValue);
	 int findCountBy(String paramName,String paramValue);
	Object findById(Long id);
	void saveAndFlush(Client cli);

}
