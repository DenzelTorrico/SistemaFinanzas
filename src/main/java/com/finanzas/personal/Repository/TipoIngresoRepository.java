package com.finanzas.personal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finanzas.personal.Model.TipoIngreso;

public interface TipoIngresoRepository extends JpaRepository<TipoIngreso,Long> {

}
