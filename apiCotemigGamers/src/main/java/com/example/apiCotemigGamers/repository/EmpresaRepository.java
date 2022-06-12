package com.example.apiCotemigGamers.repository;

import com.example.apiCotemigGamers.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("EmpresaRepository")
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
}
