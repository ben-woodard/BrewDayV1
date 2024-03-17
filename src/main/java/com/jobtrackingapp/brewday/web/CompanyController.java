package com.jobtrackingapp.brewday.web;

import com.jobtrackingapp.brewday.domain.Company;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompanyController {

    @GetMapping(value = {"", "/", "/register"})
    public String getRegister (ModelMap model) {
        model.put("company", new Company());
        return "register";
    }
}
