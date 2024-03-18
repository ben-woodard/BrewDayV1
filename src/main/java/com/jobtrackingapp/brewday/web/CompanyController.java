package com.jobtrackingapp.brewday.web;

import com.jobtrackingapp.brewday.domain.Company;
import com.jobtrackingapp.brewday.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CompanyController {

    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping(value = {"", "/"})
    public String redirectToRegister() {
        return "redirect:/register";
    }


    @GetMapping("/register")
    public String getRegister (ModelMap model) {
        model.put("company", new Company());
        return "register";
    }

    @PostMapping("/register")
    public String postRegister(Company company) {
        companyService.save(company);
        Long companyId = company.getCompanyId();
        return "redirect:/dashboard/" + companyId;
    }

    @GetMapping("/dashboard/{companyId}")
    public String getCompanyDashboard(ModelMap model, @PathVariable Long companyId) {
        Company savedCompany = companyService.findById(companyId);
        if(savedCompany == null) {
            return "redirect:/register";
        }
        model.put("company", savedCompany);
        return "dashboard";
    }
}
