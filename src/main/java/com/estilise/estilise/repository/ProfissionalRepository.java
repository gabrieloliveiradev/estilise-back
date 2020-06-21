package com.estilise.estilise.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estilise.estilise.model.modelProfissional;

@Repository
public interface ProfissionalRepository extends JpaRepository<modelProfissional, Long>{
	public List<modelProfissional> findAllByEmailprofissional(String emailprofissional);
	public Optional<modelProfissional> findByEmailprofissional(String emailprofissional);
}
