package com.springBoot.spring.controller;

import com.springBoot.spring.model.Consorcio;
import com.springBoot.spring.repository.ConsorcioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class UsuariosController {

    @Autowired
    private  ConsorcioDao consorcioDao;


    /////////////////////////////////////////////CONSULTAR UN CONSORCIO////////////////////////////////////////

    @RequestMapping(value = "api/consorcio/{id}")
    public Consorcio consorcio(@PathVariable long id){

    return null;
    }



    /////////////////////////////////////////CONSULTAR UNA LISTA DE CONSORCIOS///////////////////////////////

    @RequestMapping(value = "api/consorcios")
    public List<Consorcio> consorcios(){
        return  consorcioDao.getConsorcios();

    }



    ///////////////////////////////////////////INSERTAR UN CONSORCIO///////////////////////////////////////////

    @RequestMapping(value = "api/crearconsorcio", method = RequestMethod.POST)
    public void crearConsorcio(@RequestBody Consorcio consorcio){
        consorcioDao.crearConsorcio(consorcio);
    }


    //////////////////////////////////////////// ACTUALIZAR UN CONSORCIO//////////////////////////////////////////

    @RequestMapping(value = "api/actualizar/consorcio")
    public void actualizarConsorcio(){

    }


    ///////////////////////////////////////////////ELIMINAR UN CONSORCIO////////////////////////////////////////////

    @RequestMapping(value = "api/eliminarconsorcio/{id}", method = RequestMethod.DELETE)
    public void eliminarConsorcio(@PathVariable long id){
        consorcioDao.deleteConsorcio(id);
    }

}
