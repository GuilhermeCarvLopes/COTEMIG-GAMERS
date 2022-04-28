package com.example.apiCotemig.repository;

import com.example.apiCotemig.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("EmpresaRepository")
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
}
