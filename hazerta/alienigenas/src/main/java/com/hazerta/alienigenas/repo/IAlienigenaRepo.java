package com.hazerta.alienigenas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hazerta.alienigenas.model.*;

@Repository
public interface IAlienigenaRepo extends JpaRepository<Alienigena, Long> {
}