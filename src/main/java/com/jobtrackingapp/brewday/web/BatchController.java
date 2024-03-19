package com.jobtrackingapp.brewday.web;

import com.jobtrackingapp.brewday.domain.Batch;
import com.jobtrackingapp.brewday.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BatchController {

    private final CompanyService companyService;

    @Autowired
    public BatchController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("createbatch/{companyId}")
    public String getCreateBatch(ModelMap model, @PathVariable Long companyId) {
        model.put("batch", new Batch());
        model.put("company", companyService.findById(companyId));
        return "batch/create";
    }
}
