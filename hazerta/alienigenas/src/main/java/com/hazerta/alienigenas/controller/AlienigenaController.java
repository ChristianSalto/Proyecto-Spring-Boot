package com.hazerta.alienigenas.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;


import com.hazerta.alienigenas.service.AlienigenaService;
import com.hazerta.alienigenas.model.Alienigena;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import java.util.*;
import org.json.JSONArray;


@RestController
public class AlienigenaController {

    @Autowired
    private AlienigenaService alienigenaService;

    @GetMapping("/api/alienigenas")
    public List<Alienigena> readAll() {
        List<Alienigena> alienigenas = StreamSupport.stream(alienigenaService.findAll().spliterator(), false)
                .collect(Collectors.toList());
        return alienigenas;
    }
    
}