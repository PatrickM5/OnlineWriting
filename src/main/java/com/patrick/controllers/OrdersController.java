package com.patrick.controllers;

import com.patrick.entities.*;
import com.patrick.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class OrdersController {

    @Autowired
    ServiceRepo serviceRepo;

    @Autowired
    AcademicRepo academicRepo;
    @Autowired
    ProblemRepo problemRepo;
    @Autowired
    UrgencyRepo urgencyRepo;

    @Autowired
    CurrencyRepo currencyRepo;


    @RequestMapping("/home")
    public String orderHome(Model model){
        List<Service> allServices = serviceRepo.findAll();
        Service service = allServices.get(0);

        List<Academic> academics = academicRepo.findByService(service.getId());
        List<Problem> problems = problemRepo.findByService(service.getId());
        List<Urgency> urgencies = urgencyRepo.findByService(service.getId());
        List<Currency> currencies = currencyRepo.findAll(Sort.by(Sort.Direction.ASC, "id"));

        Double amount =0.0;
        amount+=academics.get(0).getAmount_chargable();
        amount+=problems.get(0).getAmount_chargable();
        amount+=urgencies.get(0).getAmount_chargable();
        amount+=allServices.get(0).getAmount_chargable();

        System.out.println("academics:"+academics.get(0).getAmount_chargable());
        System.out.println("urgencies:"+urgencies.get(0).getAmount_chargable());
        System.out.println("problems:"+problems.get(0).getAmount_chargable());
        System.out.println("services:"+allServices.get(0).getAmount_chargable());

        System.out.println("Amount:"+amount);

        model.addAttribute("services",allServices);
        model.addAttribute("academics",academics);
        model.addAttribute("problems",problems);
        model.addAttribute("urgencies",urgencies);
        model.addAttribute("currencies",currencies);
        model.addAttribute("init_amount",amount);


        return "/pages/orders/index";
    }

    @RequestMapping("/order")
    public String orderIndex(Model model){
        List<Service> allServices = serviceRepo.findAll();
        Service service = allServices.get(0);

        List<Academic> academics = academicRepo.findByService(service.getId());
        List<Problem> problems = problemRepo.findByService(service.getId());
        List<Urgency> urgencies = urgencyRepo.findByService(service.getId());
        List<Currency> currencies = currencyRepo.findAll(Sort.by(Sort.Direction.ASC, "id"));

        Double amount =0.0;
        amount+=academics.get(0).getAmount_chargable();
        amount+=problems.get(0).getAmount_chargable();
        amount+=urgencies.get(0).getAmount_chargable();
        amount+=allServices.get(0).getAmount_chargable();

        System.out.println("academics:"+academics.get(0).getAmount_chargable());
        System.out.println("urgencies:"+urgencies.get(0).getAmount_chargable());
        System.out.println("problems:"+problems.get(0).getAmount_chargable());
        System.out.println("services:"+allServices.get(0).getAmount_chargable());

        System.out.println("Amount:"+amount);

        model.addAttribute("services",allServices);
        model.addAttribute("academics",academics);
        model.addAttribute("problems",problems);
        model.addAttribute("urgencies",urgencies);
        model.addAttribute("currencies",currencies);
        model.addAttribute("init_amount",amount);


        return "/pages/orders/main";
    }


}