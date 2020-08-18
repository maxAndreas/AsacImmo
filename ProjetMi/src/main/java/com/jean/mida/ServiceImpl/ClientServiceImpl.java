package com.jean.mida.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jean.mida.Dao.ClientDao;
import com.jean.mida.Entity.Client;
import com.jean.mida.Service.ClientService;
@Service

public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private ClientDao dao;
	

	@Override
	public Client saveClient(Client c) {
		
		return dao.save(c);
	}

	@Override
	public Client updateClient(Client c) {
		
		return dao.save(c);
	}

	@Override
	public List<Client> getAllClient() {
		
		return dao.findAll();
	}

	@Override
	public List<Client> getAllClient(String sortField, String sort) {
	
		return dao.findAll();
	}

	@Override
	public Client getClient(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteClient(Client c) {
         dao.delete(c);

	}

	@Override
	public Client findOne(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client findOne(String[] paramNames, Object[] paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveAndFlush(Client cli) {
		// TODO Auto-generated method stub
		
	}

}
