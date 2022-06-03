package com.example.shop.dao;

import com.example.shop.entity.Participant;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class ParticipantDao {

    @PersistenceContext
    EntityManager entityManager;

    public void createProduct(Participant participant){
        entityManager.persist(participant);
    }

    public void updateProduct(Participant participant){
        entityManager.createQuery("update Participant p set p.name=: participantName,"
        + "p.surname =: participantSurname, " + "p.quantityOfDays =: quantityOfDays," + "p.type =: type" +
                        " where p.id=: id")
                .setParameter("id", participant.getId())
                .setParameter("participantName", participant.getName())
                .setParameter("participantSurname", participant.getSurname())
                .setParameter("quantityOfDays", participant.getQuantityOfDays())
                .setParameter("type", participant.getType())
                .executeUpdate();
    }

    public void deleteProduct(Participant participant){
        entityManager.remove(entityManager.contains(participant) ?
                participant : entityManager.merge(participant));
    }

    public Participant findProductById(long id){
        return entityManager.find(Participant.class, id);
    }

    public List findALlProducts(){
        Query query = entityManager.createQuery("Select p from Participant p");
        return query.getResultList();
    }

}
