package com.java.spring.crud.api.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

public interface CarroRepository extends JpaRepository<Carro, Long> {

}