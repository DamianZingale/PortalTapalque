package com.tapalque.gastronomia.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tapalque.gastronomia.demo.Entity.LocalGastronomico;

public interface LocalRepositoryInterface extends JpaRepository<LocalGastronomico, Long> {

    
    
}
