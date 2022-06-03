package com.example.shop.service;

import com.example.shop.dao.ParticipantDao;
import com.example.shop.entity.Participant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ParticipantService {

    private final ParticipantDao participantDao;


    public void saveProduct(Participant participant){
        participantDao.createProduct(participant);
    }

    public void updateProduct(Participant participant){
        participantDao.updateProduct(participant);
    }

    public void deleteProduct(Participant participant){
        participantDao.deleteProduct(participant);
    }

    public List findAll(){
        return participantDao.findALlProducts();
    }

    public Participant findById(long id){
        return participantDao.findProductById(id);
    }


}
