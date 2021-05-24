package com.patrick.controllers;

import com.patrick.entities.Academic;
import com.patrick.entities.Problem;
import com.patrick.entities.Service;
import com.patrick.entities.Urgency;
import com.patrick.payload.QueryService;
import com.patrick.repository.AcademicRepo;
import com.patrick.repository.ProblemRepo;
import com.patrick.repository.ServiceRepo;
import com.patrick.repository.UrgencyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class RestControllers {

    @Autowired
    ServiceRepo serviceRepo;

    @Autowired
    AcademicRepo academicRepo;
    @Autowired
    ProblemRepo problemRepo;
    @Autowired
    UrgencyRepo urgencyRepo;


    @PostMapping("/data/services")
    public List<Service> fetchServices(){
      return serviceRepo.findAll();
    }

    @PostMapping("/data/problems")
    public List<Problem> fetchProblems(@RequestBody QueryService service){
        System.out.println("Service:"+service);
        Optional<Service> service1 = serviceRepo.findById(Long.parseLong(service.getId()));
        if(service1.isPresent()){
            List<Problem> byService = problemRepo.findByService(service1.get().getId());
            return byService;
        }else {
            return new ArrayList<>();
        }
    }

    @PostMapping("/data/academics")
    public List<Academic> fetchAcademic(@RequestBody QueryService service){
        Optional<Service> service1 = serviceRepo.findById(Long.parseLong(service.getId()));
        if(service1.isPresent()){
            return academicRepo.findByService(service1.get().getId());
        }else {
            return new ArrayList<>();
        }
    }

    @PostMapping("/data/urgencies")
    public List<Urgency> fetchUrgencies(@RequestBody QueryService service){
        Optional<Service> service1 = serviceRepo.findById(Long.parseLong(service.getId()));
        if(service1.isPresent()){
            return urgencyRepo.findByService(service1.get().getId());
        }else {
            return new ArrayList<>();
        }
    }

}
