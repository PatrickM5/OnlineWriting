package com.patrick.utils;

import com.patrick.entities.*;
import com.patrick.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class InitData {

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

    public   boolean initializeData(){
        //Service
        saveService("Academic paper writing",12.99,"Amount Per Paper");
        saveService("Rewriting",9.99,"Amount Per Paper");
        saveService("Math/Physic/Economic/Statistic Problem",19.99,"Amount Per Paper");
        saveService("Proofreading",4.99,"Amount Per Paper");
        saveService("Editing",5.99,"Amount Per Paper");
        saveService("Copywriting",24.99,"Amount Per Paper");
        saveService("Admission Services",14.99,"Amount Per Paper");
        saveService("Dissertation Services",14.99,"Amount Per Paper");
        saveService("Resume/CV services",89.95,"Amount Per Paper");
        saveService("Multiple choice question",4.55,"Amount Per Paper");
        //problems
        saveProblem("Academic paper writing", "Essay", 0.0,"Amount per page");
        saveProblem("Academic paper writing", "Term Paper", 0.0,"Amount per page");
        saveProblem("Academic paper writing", "Research Paper", 0.0,"Amount per page");
        saveProblem("Academic paper writing", "Coursework", 0.0,"Amount per page");
        saveProblem("Academic paper writing", "Capstone Project", 0.0,"Amount per page");
        saveProblem("Academic paper writing", "Outline", 0.0,"Amount per page");
        saveProblem("Academic paper writing", "Book report", 0.0,"Amount per page");
        saveProblem("Academic paper writing", "Book review", 0.0,"Amount per page");
        saveProblem("Academic paper writing", "Movie review", 0.0,"Amount per page");
        saveProblem("Academic paper writing", "Research summary", 0.0,"Amount per page");
        saveProblem("Academic paper writing", "Report", 0.0,"Amount per page");
        saveProblem("Academic paper writing", "Case Study", 0.0,"Amount per page");
        saveProblem("Academic paper writing", "Lab report", 0.0,"Amount per page");
        saveProblem("Academic paper writing", "Power Point presentation", 0.0,"Amount per page");
        saveProblem("Academic paper writing", "Article", 0.0,"Amount per page");
        saveProblem("Academic paper writing", "Article critique", 0.0,"Amount per page");
        saveProblem("Academic paper writing", "Annotated bibliography", 0.0,"Amount per page");
        saveProblem("Academic paper writing", "Reaction paper", 0.0,"Amount per page");
        saveProblem("Academic paper writing", "Project", 0.0,"Amount per page");

        saveProblem("Rewriting", "Essay", 0.0,"Amount per page");
        saveProblem("Rewriting", "Term Paper", 0.0,"Amount per page");
        saveProblem("Rewriting", "Research Paper", 0.0,"Amount per page");
        saveProblem("Rewriting", "Coursework", 0.0,"Amount per page");
        saveProblem("Rewriting", "Book report", 0.0,"Amount per page");
        saveProblem("Rewriting", "Book review", 0.0,"Amount per page");
        saveProblem("Rewriting", "Movie review", 0.0,"Amount per page");
        saveProblem("Rewriting", "Research summary", 0.0,"Amount per page");
        saveProblem("Rewriting", "Dissertation", 0.0,"Amount per page");
        saveProblem("Rewriting", "Dissertation/Thesis proposal", 0.0,"Amount per page");
        saveProblem("Rewriting", "Case study", 0.0,"Amount per page");
        saveProblem("Rewriting", "Lab report", 0.0,"Amount per page");
        saveProblem("Rewriting", "Article", 0.0,"Amount per page");
        saveProblem("Rewriting", "Article critique", 0.0,"Amount per page");
        saveProblem("Rewriting", "Annotated bibliography", 0.0,"Amount per page");
        saveProblem("Rewriting", "Reaction paper", 0.0,"Amount per page");


        saveProblem("Math/Physic/Economic/Statistic Problem", "Calculation", 0.0,"Amount per page");
        saveProblem("Math/Physic/Economic/Statistic Problem", "Proof", 0.0,"Amount per page");
        saveProblem("Math/Physic/Economic/Statistic Problem", "Research", 0.0,"Amount per page");
        saveProblem("Math/Physic/Economic/Statistic Problem", "Equation", 0.0,"Amount per page");
        saveProblem("Math/Physic/Economic/Statistic Problem", "Optimization", 0.0,"Amount per page");
        saveProblem("Math/Physic/Economic/Statistic Problem", "Math modeling", 0.0,"Amount per page");


        saveProblem("Proofreading", "Essay", 0.0,"Amount per page");
        saveProblem("Proofreading", "Term Paper", 0.0,"Amount per page");
        saveProblem("Proofreading", "Research Paper", 0.0,"Amount per page");
        saveProblem("Proofreading", "Coursework", 0.0,"Amount per page");
        saveProblem("Proofreading", "Book report", 0.0,"Amount per page");
        saveProblem("Proofreading", "Book review", 0.0,"Amount per page");
        saveProblem("Proofreading", "Movie review", 0.0,"Amount per page");
        saveProblem("Proofreading", "Research summary", 0.0,"Amount per page");
        saveProblem("Proofreading", "Case study", 0.0,"Amount per page");
        saveProblem("Proofreading", "Lab report", 0.0,"Amount per page");
        saveProblem("Proofreading", "Article", 0.0,"Amount per page");
        saveProblem("Proofreading", "Article critique", 0.0,"Amount per page");
        saveProblem("Proofreading", "Annotated bibliography", 0.0,"Amount per page");
        saveProblem("Proofreading", "Reaction paper", 0.0,"Amount per page");

        saveProblem("Editing", "Essay", 0.0,"Amount per page");
        saveProblem("Editing", "Term Paper", 0.0,"Amount per page");
        saveProblem("Editing", "Research Paper", 0.0,"Amount per page");
        saveProblem("Editing", "Coursework", 0.0,"Amount per page");
        saveProblem("Editing", "Book report", 0.0,"Amount per page");
        saveProblem("Editing", "Book review", 0.0,"Amount per page");
        saveProblem("Editing", "Movie review", 0.0,"Amount per page");
        saveProblem("Editing", "Research summary", 0.0,"Amount per page");
        saveProblem("Editing", "Case study", 0.0,"Amount per page");
        saveProblem("Editing", "Lab report", 0.0,"Amount per page");
        saveProblem("Editing", "Article", 0.0,"Amount per page");
        saveProblem("Editing", "Article critique", 0.0,"Amount per page");
        saveProblem("Editing", "Annotated bibliography", 0.0,"Amount per page");
        saveProblem("Editing", "Reaction paper", 0.0,"Amount per page");


        saveProblem("Copywriting", "Press Release", 0.0,"Amount per page");
        saveProblem("Copywriting", "Website Content", 0.0,"Amount per page");
        saveProblem("Copywriting", "News article", 0.0,"Amount per page");
        saveProblem("Copywriting", "Blogpost", 0.0,"Amount per page");
        saveProblem("Copywriting", "Website review", 4.0,"Amount per page");
        saveProblem("Copywriting", "Product review", 0.0,"Amount per page");


        saveProblem("Admission Services", "Personal statement", 0.0,"Amount per page");
        saveProblem("Admission Services", "Admission essay", 0.0,"Amount per page");
        saveProblem("Admission Services", "Formatting", -4.0,"Amount per page");
        saveProblem("Admission Services", "Editing", -4.0,"Amount per page");
        saveProblem("Admission Services", "Scholarship essay", 0.0,"Amount per page");
        saveProblem("Admission Services", "Power Point presentation", 0.0,"Amount per page");

        saveProblem("Dissertation Services", "Dissertation", 0.0,"Amount per page");
        saveProblem("Dissertation Services", "Dissertation/Thesis proposal", 0.0,"Amount per page");
        saveProblem("Dissertation Services", "Dissertation Chapter-Abstract", 0.0,"Amount per page");
        saveProblem("Dissertation Services", "Dissertation Chapter-Introduction Chapter", 0.0,"Amount per page");
        saveProblem("Dissertation Services", "Dissertation Chapter-Literature review", 0.0,"Amount per page");
        saveProblem("Dissertation Services", "Dissertation Chapter-Results", 0.0,"Amount per page");
        saveProblem("Dissertation Services", "Dissertation Chapter-Discussion", 0.0,"Amount per page");
        saveProblem("Dissertation Services", "Formatting", -4.0,"Amount per page");
        saveProblem("Dissertation Services", "Editing", -4.0,"Amount per page");
        saveProblem("Dissertation Services", "Proofreading", -4.0,"Amount per page");
        saveProblem("Dissertation Services", "Power Point presentation", 0.0,"Amount per page");

        saveProblem("Resume/CV services", "Entry", 0.0,"Amount per page");
        saveProblem("Resume/CV services", "Professional", 0.0,"Amount per page");
        saveProblem("Resume/CV services", "Career change", 0.0,"Amount per page");
        saveProblem("Resume/CV services", "Executive", 0.0,"Amount per page");
        saveProblem("Resume/CV services", "Military", 0.0,"Amount per page");
        saveProblem("Resume/CV services", "Federal", 0.0,"Amount per page");

        saveProblem("Multiple choice question", "Multiple Choice Questions(Time-framed)", 0.0,"Amount per page");
        saveProblem("Multiple choice question", "Multiple Choice Questions(Non-time-framed)", -1.0,"Amount per page");

        //Academic
        saveAcademic("Academic paper writing", "High School", 0.0,"Amount per page");
        saveAcademic("Academic paper writing", "Freshman(College 1st year)", 2.0,"Amount per page");
        saveAcademic("Academic paper writing", "Sophomore(College 2nd year)", 2.0,"Amount per page");
        saveAcademic("Academic paper writing", "Junior(College 2nd year)", 2.0,"Amount per page");
        saveAcademic("Academic paper writing", "Senior(College 2nd year)", 6.0,"Amount per page");
        saveAcademic("Academic paper writing", "Master's", 9.0,"Amount per page");
        saveAcademic("Academic paper writing", "Doctoral", 9.0,"Amount per page");

        saveAcademic("Rewriting", "High School", 0.0,"Amount per page");
        saveAcademic("Rewriting", "Freshman(College 1st year)", 0.0,"Amount per page");
        saveAcademic("Rewriting", "Sophomore(College 2nd year)", 1.0,"Amount per page");
        saveAcademic("Rewriting", "Junior(College 2nd year)", 2.0,"Amount per page");
        saveAcademic("Rewriting", "Senior(College 2nd year)", 8.0,"Amount per page");
        saveAcademic("Rewriting", "Master's", 11.0,"Amount per page");
        saveAcademic("Rewriting", "Doctoral", 11.0,"Amount per page");

        saveAcademic("Math/Physic/Economic/Statistic Problem", "High School", 0.0,"Amount per page");
        saveAcademic("Math/Physic/Economic/Statistic Problem", "Freshman(College 1st year)", 1.0,"Amount per page");
        saveAcademic("Math/Physic/Economic/Statistic Problem", "Sophomore(College 2nd year)", 2.0,"Amount per page");
        saveAcademic("Math/Physic/Economic/Statistic Problem", "Junior(College 2nd year)", 4.0,"Amount per page");
        saveAcademic("Math/Physic/Economic/Statistic Problem", "Senior(College 2nd year)", 6.0,"Amount per page");
        saveAcademic("Math/Physic/Economic/Statistic Problem", "Master's", 8.0,"Amount per page");
        saveAcademic("Math/Physic/Economic/Statistic Problem", "Doctoral", 11.0,"Amount per page");


        saveAcademic("Proofreading", "High School", 0.0,"Amount per page");
        saveAcademic("Proofreading", "Freshman(College 1st year)", 1.0,"Amount per page");
        saveAcademic("Proofreading", "Sophomore(College 2nd year)", 3.0,"Amount per page");
        saveAcademic("Proofreading", "Junior(College 2nd year)", 4.0,"Amount per page");
        saveAcademic("Proofreading", "Senior(College 2nd year)", 6.0,"Amount per page");
        saveAcademic("Proofreading", "Master's", 7.0,"Amount per page");
        saveAcademic("Proofreading", "Doctoral", 6.0,"Amount per page");


        saveAcademic("Editing", "High School", 0.0,"Amount per page");
        saveAcademic("Editing", "Freshman(College 1st year)", 2.0,"Amount per page");
        saveAcademic("Editing", "Sophomore(College 2nd year)", 3.0,"Amount per page");
        saveAcademic("Editing", "Junior(College 2nd year)", 4.0,"Amount per page");
        saveAcademic("Editing", "Senior(College 2nd year)", 5.0,"Amount per page");
        saveAcademic("Editing", "Master's", 7.0,"Amount per page");
        saveAcademic("Editing", "Doctoral", 9.0,"Amount per page");

        saveAcademic("Admission Services", "College", 0.0,"Amount per page");
        saveAcademic("Admission Services", "Graduate", 1.0,"Amount per page");
        saveAcademic("Admission Services", "MBA", 2.0,"Amount per page");
        saveAcademic("Admission Services", "Law", 2.0,"Amount per page");
        saveAcademic("Admission Services", "Medical", 2.0,"Amount per page");


        saveAcademic("Dissertation Services", "Associate's", 0.0,"Amount per page");
        saveAcademic("Dissertation Services", "Bachelor's", 4.0,"Amount per page");
        saveAcademic("Dissertation Services", "Master's", 7.0,"Amount per page");
        saveAcademic("Dissertation Services", "Doctoral", 7.0,"Amount per page");

        saveAcademic("Resume/CV services", "Entry", 0.0,"Amount per page");
        saveAcademic("Resume/CV services", "Professional", 5.0,"Amount per page");
        saveAcademic("Resume/CV services", "Career change", 7.0,"Amount per page");
        saveAcademic("Resume/CV services", "Executive", 15.0,"Amount per page");
        saveAcademic("Resume/CV services", "Military", 7.0,"Amount per page");
        saveAcademic("Resume/CV services", "Federal", 15.0,"Amount per page");

        saveAcademic("Multiple choice question", "High School", 0.0,"Amount per page");
        saveAcademic("Multiple choice question", "Freshman(College 1st year)", 0.0,"Amount per page");
        saveAcademic("Multiple choice question", "Sophomore(College 2nd year)", 0.0,"Amount per page");
        saveAcademic("Multiple choice question", "Junior(College 2nd year)", 0.0,"Amount per page");
        saveAcademic("Multiple choice question", "Senior(College 2nd year)", 0.0,"Amount per page");
        saveAcademic("Multiple choice question", "Master's", 1.0,"Amount per page");
        saveAcademic("Multiple choice question", "Doctoral", 1.0,"Amount per page");

//Urgency
        saveAUrgency("Academic paper writing", "3 hours", 29.0,"Amount per page");
        saveAUrgency("Academic paper writing", "6 hours", 23.0,"Amount per page");
        saveAUrgency("Academic paper writing", "8 hours", 21.0,"Amount per page");
        saveAUrgency("Academic paper writing", "12 hours", 17.0,"Amount per page");
        saveAUrgency("Academic paper writing", "18 hours", 15.0,"Amount per page");
        saveAUrgency("Academic paper writing", "24 hours", 12.0,"Amount per page");
        saveAUrgency("Academic paper writing", "48 hours", 11.0,"Amount per page");
        saveAUrgency("Academic paper writing", "3 days", 8.0,"Amount per page");
        saveAUrgency("Academic paper writing", "4 days", 7.0,"Amount per page");
        saveAUrgency("Academic paper writing", "5 days", 6.0,"Amount per page");
        saveAUrgency("Academic paper writing", "6 days", 4.0,"Amount per page");
        saveAUrgency("Academic paper writing", "7 days", 3.56,"Amount per page");
        saveAUrgency("Academic paper writing", "10 days", 3.0,"Amount per page");
        saveAUrgency("Academic paper writing", "14 days", 0.0,"Amount per page");


        saveAUrgency("Rewriting", "6 hours", 26.0,"Amount per page");
        saveAUrgency("Rewriting", "8 hours", 22.0,"Amount per page");
        saveAUrgency("Rewriting", "12 hours", 20.0,"Amount per page");
        saveAUrgency("Rewriting", "18 hours", 18.0,"Amount per page");
        saveAUrgency("Rewriting", "24 hours", 24.0,"Amount per page");
        saveAUrgency("Rewriting", "48 hours", 22.0,"Amount per page");
        saveAUrgency("Rewriting", "3 days", 10.0,"Amount per page");
        saveAUrgency("Rewriting", "4 days", 9.0,"Amount per page");
        saveAUrgency("Rewriting", "5 days", 8.56,"Amount per page");
        saveAUrgency("Rewriting", "6 days", 8.0,"Amount per page");
        saveAUrgency("Rewriting", "7 days", 7.56,"Amount per page");
        saveAUrgency("Rewriting", "10 days", 7.0,"Amount per page");
        saveAUrgency("Rewriting", "14 days", 0.0,"Amount per page");


        saveAUrgency("Math/Physic/Economic/Statistic Problem", "12 hours", 23.0,"Amount per page");
        saveAUrgency("Math/Physic/Economic/Statistic Problem", "18 hours", 19.0,"Amount per page");
        saveAUrgency("Math/Physic/Economic/Statistic Problem", "24 hours", 15.0,"Amount per page");
        saveAUrgency("Math/Physic/Economic/Statistic Problem", "48 hours", 11.0,"Amount per page");
        saveAUrgency("Math/Physic/Economic/Statistic Problem", "3 days", 9.0,"Amount per page");
        saveAUrgency("Math/Physic/Economic/Statistic Problem", "4 days", 7.0,"Amount per page");
        saveAUrgency("Math/Physic/Economic/Statistic Problem", "5 days", 5.0,"Amount per page");
        saveAUrgency("Math/Physic/Economic/Statistic Problem", "6 days", 3.0,"Amount per page");
        saveAUrgency("Math/Physic/Economic/Statistic Problem", "7 days", 1.0,"Amount per page");
        saveAUrgency("Math/Physic/Economic/Statistic Problem", "10 days", 1.0,"Amount per page");
        saveAUrgency("Math/Physic/Economic/Statistic Problem", "14 days", 0.0,"Amount per page");


        saveAUrgency("Proofreading", "6 hours", 17.0,"Amount per page");
        saveAUrgency("Proofreading", "8 hours", 15.0,"Amount per page");
        saveAUrgency("Proofreading", "12 hours", 13.0,"Amount per page");
        saveAUrgency("Proofreading", "18 hours", 12.0,"Amount per page");
        saveAUrgency("Proofreading", "24 hours", 10.0,"Amount per page");
        saveAUrgency("Proofreading", "48 hours", 9.0,"Amount per page");
        saveAUrgency("Proofreading", "3 days", 8.0,"Amount per page");
        saveAUrgency("Proofreading", "4 days", 2.56,"Amount per page");
        saveAUrgency("Proofreading", "5 days", 7.0,"Amount per page");
        saveAUrgency("Proofreading", "6 days", 6.0,"Amount per page");
        saveAUrgency("Proofreading", "7 days", 1.0,"Amount per page");
        saveAUrgency("Proofreading", "10 days", 5.0,"Amount per page");
        saveAUrgency("Proofreading", "14 days", 0.0,"Amount per page");


        saveAUrgency("Editing", "6 hours", 14.0,"Amount per page");
        saveAUrgency("Editing", "8 hours", 12.0,"Amount per page");
        saveAUrgency("Editing", "12 hours", 10.0,"Amount per page");
        saveAUrgency("Editing", "18 hours", 8.0,"Amount per page");
        saveAUrgency("Editing", "24 hours", 6.0,"Amount per page");
        saveAUrgency("Editing", "48 hours", 5.0,"Amount per page");
        saveAUrgency("Editing", "3 days", 3.0,"Amount per page");
        saveAUrgency("Editing", "4 days", 2.56,"Amount per page");
        saveAUrgency("Editing", "5 days", 2.0,"Amount per page");
        saveAUrgency("Editing", "6 days", 1.56,"Amount per page");
        saveAUrgency("Editing", "7 days", 1.0,"Amount per page");
        saveAUrgency("Editing", "10 days", 0.56,"Amount per page");
        saveAUrgency("Editing", "14 days", 0.0,"Amount per page");


        saveAUrgency("Copywriting", "18 hours", 22.0,"Amount per page");
        saveAUrgency("Copywriting", "24 hours", 18.0,"Amount per page");
        saveAUrgency("Copywriting", "48 hours", 14.0,"Amount per page");
        saveAUrgency("Copywriting", "3 days", 12.0,"Amount per page");
        saveAUrgency("Copywriting", "4 days", 10.0,"Amount per page");
        saveAUrgency("Copywriting", "5 days", 7.0,"Amount per page");
        saveAUrgency("Copywriting", "6 days", 5.0,"Amount per page");
        saveAUrgency("Copywriting", "7 days", 3.0,"Amount per page");
        saveAUrgency("Copywriting", "10 days", 1.0,"Amount per page");
        saveAUrgency("Copywriting", "14 days", 0.0,"Amount per page");



        saveAUrgency("Admission Services", "6 hours", 25.0,"Amount per page");
        saveAUrgency("Admission Services", "8 hours", 25.0,"Amount per page");
        saveAUrgency("Admission Services", "12 hours", 23.0,"Amount per page");
        saveAUrgency("Admission Services", "18 hours", 21.0,"Amount per page");
        saveAUrgency("Admission Services", "24 hours", 19.0,"Amount per page");
        saveAUrgency("Admission Services", "48 hours", 14.0,"Amount per page");
        saveAUrgency("Admission Services", "3 days", 11.0,"Amount per page");
        saveAUrgency("Admission Services", "4 days", 8.0,"Amount per page");
        saveAUrgency("Admission Services", "5 days", 7.0,"Amount per page");
        saveAUrgency("Admission Services", "6 days", 6.0,"Amount per page");
        saveAUrgency("Admission Services", "7 days", 5.0,"Amount per page");
        saveAUrgency("Admission Services", "10 days", 2.0,"Amount per page");
        saveAUrgency("Admission Services", "14 days", 0.0,"Amount per page");



        saveAUrgency("Dissertation Services", "12 hours", 15.0,"Amount per page");
        saveAUrgency("Dissertation Services", "18 hours", 13.0,"Amount per page");
        saveAUrgency("Dissertation Services", "24 hours", 10.0,"Amount per page");
        saveAUrgency("Dissertation Services", "48 hours", 9.0,"Amount per page");
        saveAUrgency("Dissertation Services", "3 days", 6.0,"Amount per page");
        saveAUrgency("Dissertation Services", "4 days", 5.0,"Amount per page");
        saveAUrgency("Dissertation Services", "5 days", 4.0,"Amount per page");
        saveAUrgency("Dissertation Services", "6 days", 2.0,"Amount per page");
        saveAUrgency("Dissertation Services", "7 days", 1.56,"Amount per page");
        saveAUrgency("Dissertation Services", "10 days", 1.0,"Amount per page");
        saveAUrgency("Dissertation Services", "14 days", 0.0,"Amount per page");
        saveAUrgency("Dissertation Services", "30 days", -1.0,"Amount per page");
        saveAUrgency("Dissertation Services", "2 months", -2.0,"Amount per page");


        saveAUrgency("Resume/CV services", "24 hours", 45.0,"Amount per page");
        saveAUrgency("Resume/CV services", "48 hours", 10.0,"Amount per page");
        saveAUrgency("Resume/CV services", "3 days", 5.0,"Amount per page");
        saveAUrgency("Resume/CV services", "5 days", 0.0,"Amount per page");


        saveAUrgency("Multiple choice question", "6 hours", 3.0,"Amount per page");
        saveAUrgency("Multiple choice question", "8 hours", 2.44,"Amount per page");
        saveAUrgency("Multiple choice question", "12 hours", 2.0,"Amount per page");
        saveAUrgency("Multiple choice question", "18 hours", 1.44,"Amount per page");
        saveAUrgency("Multiple choice question", "24 hours", 1.0,"Amount per page");
        saveAUrgency("Multiple choice question", "48 hours", 0.0,"Amount per page");



        //Currency
        saveCurrency("USD");
        saveCurrency("GPD");
        saveCurrency("EUR");
        saveCurrency("CAD");
        saveCurrency("AUD");




        return  true;
    }


    public void saveCurrency(String name){

        Optional<Currency> apw =currencyRepo.findByName(name);
        if(!apw.isPresent()){
            Currency currency = new Currency();
            currency.setName(name);
            Currency save = currencyRepo.save(currency);
        }
    }


    public void saveService(String name, Double amount, String desc){

        Optional<Service> apw =serviceRepo.findByName(name);
        if(!apw.isPresent()){
            Service service = new Service();
            service.setName(name);
            service.setAmount_chargable(amount);
            service.setDesc_chargable(desc);
            Service save = serviceRepo.save(service);
        }
    }

    public void saveProblem(String serviceName, String problemName, Double amount, String desc ){
        Optional<Service> optionalService = serviceRepo.findByName(serviceName);

        if(optionalService.isPresent()) {
            Optional<Problem> byServiceAndName = problemRepo.findByServiceAndName(optionalService.get().getId(), problemName);
           if(!byServiceAndName.isPresent()) {
               Problem problem = new Problem();
               problem.setName(problemName);
               problem.setService(optionalService.get());
               problem.setAmount_chargable(amount);
               problem.setDesc_chargable(desc);
               Problem save = problemRepo.save(problem);
           }
        }
    }

    public void saveAcademic(String serviceName, String problemName, Double amount, String desc ){
        Optional<Service> optionalService = serviceRepo.findByName(serviceName);
        if(optionalService.isPresent()) {
            Optional<Academic> byServiceAndName = academicRepo.findByServiceAndName(optionalService.get().getId(), problemName);
            if(!byServiceAndName.isPresent()) {
                Academic academic = new Academic();
                academic.setName(problemName);
                academic.setService(optionalService.get());
                academic.setAmount_chargable(amount);
                academic.setDesc_chargable(desc);
                Academic save = academicRepo.save(academic);
            }

        }
    }


    public void saveAUrgency(String serviceName, String problemName, Double amount, String desc ){
        Optional<Service> optionalService = serviceRepo.findByName(serviceName);
        if(optionalService.isPresent()) {
            Optional<Urgency> byServiceAndName = urgencyRepo.findByServiceAndName(optionalService.get().getId(), problemName);
            if(!byServiceAndName.isPresent()) {
                Urgency urgency = new Urgency();
                urgency.setName(problemName);
                urgency.setService(optionalService.get());
                urgency.setAmount_chargable(amount);
                urgency.setDesc_chargable(desc);
                Urgency save = urgencyRepo.save(urgency);
            }

        }
    }

}
