package com.springBoot.spring.repository;

import com.springBoot.spring.model.Consorcio;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class ConsorcioDaoImplementacion implements ConsorcioDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Consorcio> getConsorcios() {
        String query="FROM Consorcio";
        return entityManager.createQuery(query).getResultList();

    }

    @Override
    public void deleteConsorcio(long id) {
        Consorcio consorcio= entityManager.find(Consorcio.class,id);
        entityManager.remove(consorcio);

    }

    @Override
    public void crearConsorcio(Consorcio consorcio) {
        entityManager.merge(consorcio);
    }
}
