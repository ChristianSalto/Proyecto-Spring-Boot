package com.hazerta.alienigenas.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.hazerta.alienigenas.repo.IAlienigenaRepo;
import com.hazerta.alienigenas.model.Alienigena;

@Service
public class AlienigenaServiceImpl implements AlienigenaService{

  @Autowired
  private IAlienigenaRepo iAlienigenaRepo;  
    
    
  @Override
  @Transactional(readOnly = true)
  public Iterable<Alienigena> findAll() {      
      return iAlienigenaRepo.findAll();
  }

}