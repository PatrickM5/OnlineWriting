package com.patrick.RestController;


import com.patrick.entities.Academic;
import com.patrick.entities.Service;
import com.patrick.repository.AcademicRepo;
import com.patrick.repository.ProblemRepo;
import com.patrick.repository.ServiceRepo;
import com.patrick.repository.UrgencyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class RestOrdersController {

    @Autowired
    ServiceRepo serviceRepo;

    @Autowired
    AcademicRepo academicRepo;
    @Autowired
    ProblemRepo problemRepo;
    @Autowired
    UrgencyRepo urgencyRepo;


    @RequestMapping("/view/order")
    public String orderIndex(){

        List<Service> allServices = serviceRepo.findAll();

        String firstServiceName= allServices.get(0).getName();

        System.out.println(allServices);

        return "/pages/orders/index";
    }

}
