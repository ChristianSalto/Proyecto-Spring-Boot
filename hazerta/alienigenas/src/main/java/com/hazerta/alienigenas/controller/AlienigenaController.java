package com.hazerta.alienigenas.controller;

import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;


import com.hazerta.alienigenas.service.AlienigenaService;
import com.hazerta.alienigenas.model.Alienigena;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import java.util.*;
import org.json.JSONArray;

@Controller
@RestController
public class AlienigenaController {

    @Autowired
    private AlienigenaService alienigenaService;

    // @GetMapping
    // public String index(Model modelo) {
    //     modelo.addAttribute("mensaje","Bienvenidos a Sring boot aliens !!!!");
    //     List<Alienigena> alienigenas = StreamSupport.stream(alienigenaService.findAll().spliterator(), false).collect(Collectors.toList());
    //     JSONObject objetoJs = new JSONObject(alienigenas);

    //     System.out.println(objetoJs);
    //     modelo.addAttribute("aliens",alienigenas);
    //     return "index";
    // }

    @GetMapping("/api/alienigenas")
    public List<Alienigena> readAll() {
        List<Alienigena> alienigenas = StreamSupport.stream(alienigenaService.findAll().spliterator(), false)
                .collect(Collectors.toList());

                JSONArray objetoJs = new JSONArray(alienigenas);
                System.out.println("estoy en api" + objetoJs);

        return alienigenas;
    }
    
}