package com.jean.mida.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jean.mida.Entity.Client;

public interface ClientDao extends JpaRepository<Client, Long> {

}
