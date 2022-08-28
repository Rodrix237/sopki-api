package com.seanjacksonservices.web;

import com.seanjacksonservices.model.Kit;
import  com.seanjacksonservices.service.impl.KitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/kit")
public class KitController {

    @Autowired
    KitServiceImpl service;

    @GetMapping("/")
    public List<Kit> racine(){

        return service.findAll();
    }

    @GetMapping("/all/")
    public List<Kit> listAllKit(){

        return service.findAll();
    }

    //Deux facon de faire une requete GET sur une API avec un parametre URL (idKit)

    //Methode 1 : Anciennes versions de Spring
    @RequestMapping(path = "/{idKit}", method = RequestMethod.GET)
    public Optional<Kit> kitById(HttpServletResponse response, @PathVariable Integer idKit){

        return service.findOne(idKit);
    }

    //Methode 2 : Recentes version de Spring (Juillet 2021) en precisant directement GetMapping
    @GetMapping("/specific/{idKit}")
    public Optional<Kit> getKitById(HttpServletResponse response, @PathVariable Integer idKit){

        return service.findOne(idKit);
    }
}
