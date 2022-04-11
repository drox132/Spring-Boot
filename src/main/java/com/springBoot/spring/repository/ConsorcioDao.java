package com.springBoot.spring.repository;

import com.springBoot.spring.model.Consorcio;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ConsorcioDao {

    List<Consorcio> getConsorcios();

    void deleteConsorcio(long id);

    void crearConsorcio(Consorcio consorcio);
}
