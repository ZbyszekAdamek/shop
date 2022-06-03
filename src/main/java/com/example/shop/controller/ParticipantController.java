package com.example.shop.controller;

import com.example.shop.dao.ParticipantDao;
import com.example.shop.entity.Participant;
import com.example.shop.service.ParticipantService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ParticipantController {

    private final ParticipantDao participantDao;
    private final ParticipantService participantService;

    public ParticipantController(ParticipantDao participantDao, ParticipantService participantService) {
        this.participantDao = participantDao;
        this.participantService = participantService;
    }

    @RequestMapping("/orders")
    public String aboutUs(){
        return "orders";
    }

    @GetMapping("/add")
    public String addProduct(Model model){
        model.addAttribute("participant", new Participant());
        return "add";
    }

    @PostMapping("/add")
    public String addProductData(Participant participant, BindingResult result){

        participantDao.createProduct(participant);
        return "add";
    }
}
