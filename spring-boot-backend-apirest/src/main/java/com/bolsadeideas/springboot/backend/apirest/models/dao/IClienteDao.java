package com.bolsadeideas.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{
	
	
	@Query("select avg(edad) FROM Cliente")
	public List<?> findaverage();
	

	@Query(value = "select std(edad) FROM db_springboot_backend.clientes", nativeQuery = true)
	public List<?> findstd();
	
}
