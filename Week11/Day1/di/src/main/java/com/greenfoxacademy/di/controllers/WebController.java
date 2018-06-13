package com.greenfoxacademy.di.controllers;

import com.greenfoxacademy.di.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    UtilityService utilityService;

    @Autowired
    public WebController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String landingPage() {
        return "useful";
    }

    @GetMapping("/useful/colored")
    public String randomColor(Model model) {
        model.addAttribute("colors", utilityService.randomColor());
        return "background";
    }

    @GetMapping("useful/{email}")
    public String emailCheck(@RequestParam("email") String address, Model model) {

       // String address = "mikula_klara@yahoo.fr";
        model.addAttribute("emailCheck", utilityService.validateEmail(address));
        model.addAttribute("trueResponse", "is@this.valid is a valid email address");
        model.addAttribute("falseResponse", "not_valid_email.com is not a valid email address");
        return "email";
    }


}



